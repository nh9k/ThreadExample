//0821
package exchange2;

import java.util.Scanner;

public class 원화환산 {
	public static void main(String []args)
	{
		int 원화, 미화, 거스름돈;
		Scanner s = new Scanner(System.in);
		
		System.out.print("원화(원)?");
		원화 = s.nextInt();
		
		미화 = 원화 / 1120;
		//거스름돈 = 원화 -(미화*1120);
		거스름돈  = 원화 % 1120;
			
		System.out.println(원화 + "(원)" + "=>" + 미화 + "(" + 거스름돈 + ")");
	}
}
