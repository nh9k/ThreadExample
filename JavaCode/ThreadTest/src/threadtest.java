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
             //��ǻ�Ͱ� �ʹ� ������ ������ �������� �� Ȯ�� �� �� ��� Thread.sleep() �޼��带 �̿��ؼ� ���ݾ� 
             //�����ٰ� ����� �� �ְ��Ѵ�. 
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
             //��ǻ�Ͱ� �ʹ� ������ ������ �������� �� Ȯ�� �� �� ��� Thread.sleep() �޼��带 �̿��ؼ� ���ݾ� 
             //�����ٰ� ����� �� �ְ��Ѵ�. 
        //     Thread.sleep((int)(Math.random() * 1000));
        // } catch (InterruptedException e) {
         //    e.printStackTrace();
         //}
		}
	}
}