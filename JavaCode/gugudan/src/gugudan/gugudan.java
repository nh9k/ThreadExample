//0825
package gugudan;
import java.util.Scanner;

public class gugudan {
	public void calculation(int num){ //method: num�� ��������(parameter)
		for(int i=1; i<10; i++) {
			//System.out.println(num + " * " + i + " = " + num*i);
			System.out.printf("%d * %d = %d\n", num, i, num*i);
		}
	}
	
	public static void main(String []args){
		gugudan gugudanobj; //������ ��� ��ü ����
		gugudanobj = new gugudan(); //��ü ������ ������ ��ü�� ����
		gugudanobj.calculation(3); //method ���: ȣ��(call, invocation)
		//���⼭ 3�� ����: 3�� ������(argument)
	}
}
