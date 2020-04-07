import java.util.Scanner;
import java.lang.Thread;

public class threadtest {
	public static void main(String[] args) {
		MyThread th=new MyThread();
		th.start();
		
		while(true) {
			System.out.print("A");
			try{
				Thread.sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			//try {
             //컴퓨터가 너무 빠르기 때문에 수행결과를 잘 확인 할 수 없어서 Thread.sleep() 메서드를 이용해서 조금씩 
             //쉬었다가 출력할 수 있게한다. 
            // Thread.sleep((int)(Math.random() * 1000));
         //} catch (InterruptedException e) {
         //    e.printStackTrace();
         //}
		}
	}
}

class MyThread extends Thread{
	public void run() {
		while(true) {
			System.out.print("B");
			try{
				Thread.sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		// try {
             //컴퓨터가 너무 빠르기 때문에 수행결과를 잘 확인 할 수 없어서 Thread.sleep() 메서드를 이용해서 조금씩 
             //쉬었다가 출력할 수 있게한다. 
        //     Thread.sleep((int)(Math.random() * 1000));
        // } catch (InterruptedException e) {
         //    e.printStackTrace();
         //}
		}
	}
}