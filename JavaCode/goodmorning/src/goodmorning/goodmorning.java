//0821
package goodmorning;

import java.util.Scanner;

public class goodmorning {
	public static void main(String []args)
	{
		int wakeup;
		Scanner s = new Scanner(System.in);
		
		System.out.print("�Ͼ �ð�: ");
		wakeup = s.nextInt();
		s.close();
		
		if(wakeup < 900)
			System.out.println("���� ��ħ");
		else
			System.out.println("����");
	}
}
