//0821
package goodmorning;

import java.util.Scanner;

public class goodmorning {
	public static void main(String []args)
	{
		int wakeup;
		Scanner s = new Scanner(System.in);
		
		System.out.print("일어난 시간: ");
		wakeup = s.nextInt();
		s.close();
		
		if(wakeup < 900)
			System.out.println("좋은 아침");
		else
			System.out.println("지각");
	}
}
