//0821
package exchange2;

import java.util.Scanner;

public class ��ȭȯ�� {
	public static void main(String []args)
	{
		int ��ȭ, ��ȭ, �Ž�����;
		Scanner s = new Scanner(System.in);
		
		System.out.print("��ȭ(��)?");
		��ȭ = s.nextInt();
		
		��ȭ = ��ȭ / 1120;
		//�Ž����� = ��ȭ -(��ȭ*1120);
		�Ž�����  = ��ȭ % 1120;
			
		System.out.println(��ȭ + "(��)" + "=>" + ��ȭ + "(" + �Ž����� + ")");
	}
}
