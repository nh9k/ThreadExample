//0825
package gugudan;
import java.util.Scanner;

public class gugudan {
	public void calculation(int num){ //method: num는 형식인자(parameter)
		for(int i=1; i<10; i++) {
			//System.out.println(num + " * " + i + " = " + num*i);
			System.out.printf("%d * %d = %d\n", num, i, num*i);
		}
	}
	
	public static void main(String []args){
		gugudan gugudanobj; //구구단 모양 객체 선언
		gugudanobj = new gugudan(); //객체 생성후 구구단 객체에 저장
		gugudanobj.calculation(3); //method 사용: 호출(call, invocation)
		//여기서 3을 대입: 3은 실인자(argument)
	}
}
