/*
public class HelloJAVA { //0814: 개발환경설정(4)
	public static void main(String[] args) {
		String name = "김난희";
		System.out.println("Hello"+name);
	}
}*/
/*
public class HelloJAVA { //0815: 프로그래밍 따라하기(1)(2)
	public static void main(String[] args) {
		int p;
		p = 231 * 69;
		System.out.println("계산결과: " + p);
	}
}*/
import java.util.Scanner;
public class HelloJAVA { //0815: 프로그래밍 따라하기(3)
	public static void main(String[] args) {
		int n1, n2;
		//java.util.Scanner s = new java.util.Scanner(System.in);
		Scanner s = new Scanner(System.in);
		System.out.print("첫 번째 정수: ");
		n1 = s.nextInt(); //scanner 객체가 가지고 있는 입력 함수
		System.out.print("두 번째 정수: ");
		n2 = s.nextInt();
		
		//int p = n1 * n2;
		//System.out.println("계산결과: " + p);
		System.out.println("계산결과: " + n1 + "*"+ n2+ "=" +n1*n2);
	}
}
