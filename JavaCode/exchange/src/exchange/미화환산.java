//0821
package exchange;

import java.util.Scanner;

public class 미화환산 {
	public static void main(String []args) {
		int 미화, 원화; //double로 만들기
		Scanner s = new Scanner(System.in);
		
		System.out.print("미화($)?");
		미화 = s.nextInt(); //double을 입력받고 싶은 경우 nextDouble
		s.close();
		
		원화 = 미화 * 1120;
		System.out.println("$" + 미화 + "=>" + 원화 + "원");
	}
}
