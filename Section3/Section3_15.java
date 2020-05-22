import java.util.Scanner;

public class Section3_15 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);

		System.out.print("整数A：　");
		int a=stdIn.nextInt();

		System.out.print("整数B：　");
		int b=stdIn.nextInt();
		
		
		if(b>a){
			int t=a;
			a=b;
			b=t;
		}
		System.out.println("a≧bとなるようにソートしました。");
		System.out.println("整数Aは"+a+"です");
		System.out.println("整数Bは"+b+"です");
	}
}