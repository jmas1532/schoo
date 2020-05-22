import java.util.Scanner;

public class Section3_14 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);

		System.out.print("整数A：　");
		int a=stdIn.nextInt();

		System.out.print("整数B：　");
		int b=stdIn.nextInt();
		
		int min,max;
		
		if(a>b){
			max=a;
			min=b;
		}else{
			max=b;
			min=a;
		}
		if(a==b){
			System.out.println("二つの値は同じです");
		}else{
			System.out.println("小さいほうの値は"+min);
			System.out.println("大きいほうの値は"+max);
		}
	}
}