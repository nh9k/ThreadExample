import java.util.concurrent.Semaphore;

public class producer_consumerProblem {
	public static void main(String[] arg) {
		Buffer b = new Buffer(100);
		Producer p = new Producer(b, 10000);
		Consumer c = new Consumer(b, 10000);
		p.start();
		c.start();
		try {
			p.join();
			c.join();
		} catch (InterruptedException e) {
		}
		System.out.println("Number of items in the buf is " + b.count);
	}
}

class Buffer {
	int[] buf;
	int size;
	int count;
	int in;
	int out;
	Semaphore mutex;
	Semaphore full, empty;

	Buffer(int size) {
		buf = new int[size];
		this.size = size;
		count = in = out = 0;
		mutex = new Semaphore(1);
		full = new Semaphore(0);
		empty = new Semaphore(size);
	}

	void insert(int item) {
		/* check if buf is full */
		//while (count == size)
		//	;
		/* buf is not full */
		try {
			mutex.acquire();
			empty.acquire();
		
			buf[in] = item;
			in = (in + 1) % size;
			count++;
			System.out.print("+");
			//Thread.sleep(100);
			full.release();
			mutex.release();
		} catch (InterruptedException e) {}
	
	}

	int remove() {
		/* check if buf is empty */
		//while (count == 0)
		//	;
		/* buf is not empty */
		try {
			mutex.acquire();
			full.acquire();
		
			int item = buf[out];
			out = (out + 1) % size;
			count--;
			System.out.print("-");
		
			//Thread.sleep(100);
			empty.release();
			mutex.release();
			return item;
		} catch (InterruptedException e) {}
		return -1;
	}
}

/****** 생산자 ******/
class Producer extends Thread {
	Buffer b;
	int N;

	Producer(Buffer b, int N) {
		this.b = b;
		this.N = N;
	}

	public void run() {
		for (int i = 0; i < N; i++)
			b.insert(i);
	}
}

/****** 소비자 ******/
class Consumer extends Thread {
	Buffer b;
	int N;

	Consumer(Buffer b, int N) {
		this.b = b;
		this.N = N;
	}

	public void run() {
		int item;
		for (int i = 0; i < N; i++)
			item = b.remove();
	}
}
