//0821
package exchange;

import java.util.Scanner;

public class ��ȭȯ�� {
	public static void main(String []args) {
		int ��ȭ, ��ȭ; //double�� �����
		Scanner s = new Scanner(System.in);
		
		System.out.print("��ȭ($)?");
		��ȭ = s.nextInt(); //double�� �Է¹ް� ���� ��� nextDouble
		s.close();
		
		��ȭ = ��ȭ * 1120;
		System.out.println("$" + ��ȭ + "=>" + ��ȭ + "��");
	}
}
