//import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class SemaphoreTest {
	public static void main(String[] args)
	throws InterruptedException{
	bank_account b = new bank_account();
	parent p = new parent(b);
	child c = new child(b);
	
	p.start();
	c.start();
	p.join();
	c.join();
	System.out.println("\nbalance = " + b.getbalance());
	
	}
}

class bank_account{
	int balance;
	//Semaphore sem;
	//Semaphore sem2;
	Semaphore dsem, wsem;
	bank_account(){
		//sem = new Semaphore(1); //value 값 1 넣어줌
		//sem2 = new Semaphore(0); // 항상 parent 먼저 실행 후 child 실행하게 하기
		dsem = new Semaphore(0);
		wsem = new Semaphore(0);
	}
	void deposit(int amount){
		try {
		//sem.acquire();
		//sem2.acquire();
		

		balance += amount;
		System.out.print("+");
		//sem.release();
		//sem2.release();
		wsem.release();
		dsem.acquire();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	void withdraw(int amount){
		try {
		//sem.acquire();
		//sem2.acquire();
		wsem.acquire();
		balance -= amount;
		System.out.print("-");
		//sem.release();
		//sem2.release();
		dsem.release();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	int getbalance()
	{
		return balance;
	}
}

class parent extends Thread{
	bank_account b;
	parent(bank_account b){
		this.b=b;
	}
	public void run() {
		for(int i=0; i<1000; i++)
			b.deposit(1000);
	}
}

class child extends Thread{
	bank_account b;
	child(bank_account b){
		this.b=b;
	}
	public void run() {
		for(int i=0; i<1000; i++)
			b.withdraw(1000);
	}
}