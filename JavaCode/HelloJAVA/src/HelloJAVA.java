/*
public class HelloJAVA { //0814: ����ȯ�漳��(4)
	public static void main(String[] args) {
		String name = "�賭��";
		System.out.println("Hello"+name);
	}
}*/
/*
public class HelloJAVA { //0815: ���α׷��� �����ϱ�(1)(2)
	public static void main(String[] args) {
		int p;
		p = 231 * 69;
		System.out.println("�����: " + p);
	}
}*/
import java.util.Scanner;
public class HelloJAVA { //0815: ���α׷��� �����ϱ�(3)
	public static void main(String[] args) {
		int n1, n2;
		//java.util.Scanner s = new java.util.Scanner(System.in);
		Scanner s = new Scanner(System.in);
		System.out.print("ù ��° ����: ");
		n1 = s.nextInt(); //scanner ��ü�� ������ �ִ� �Է� �Լ�
		System.out.print("�� ��° ����: ");
		n2 = s.nextInt();
		
		//int p = n1 * n2;
		//System.out.println("�����: " + p);
		System.out.println("�����: " + n1 + "*"+ n2+ "=" +n1*n2);
	}
}
