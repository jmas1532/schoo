import java.util.Scanner;

public class Section3_12 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);

		System.out.print("整数A：　");
		int a=stdIn.nextInt();

		System.out.print("整数B：　");
		int b=stdIn.nextInt();
		
		
		System.out.print("整数C：　");
		int c=stdIn.nextInt();
		
		int min =a;
		
		if(b<min){
			min=b;
		}
		if(c<min){
			min=c;
		}
		System.out.println("最小値は"+min);
	}
}