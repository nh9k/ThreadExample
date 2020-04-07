//0825 field 사용해서 구구단 출력
package gugudan;
import java.util.Scanner;

public class gugudan2 {
	int num; //field 사용
	
	public void gugudan(){
		for(int i=1; i<10; i++)
			System.out.printf("%d * %d = %d\n",num, i, num*i);
	}
	public static void main(String []args){	
		gugudan2 testobj;
		testobj = new gugudan2();
		testobj.num = 3;
		testobj.gugudan();
	}
}
