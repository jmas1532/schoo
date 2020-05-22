import java.util.Scanner;

public class Section3_16 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);

		System.out.print("整数A：　");
		int a=stdIn.nextInt();

		System.out.print("整数B：　");
		int b=stdIn.nextInt();
		
		System.out.print("整数C：　");
		int c=stdIn.nextInt();
		
		if(b>c){
			int s=b;
			b=c;
			c=s;
		}
		if(a>b){
			int t=a;
			a=b;
			b=t;
		}
		if(b>c){
			int u=b;
			b=c;
			c=u;
		}
		System.out.println("昇順にソートしました。");
		System.out.println("整数Aは"+a+"です");
		System.out.println("整数Bは"+b+"です");
		System.out.println("整数Cは"+c+"です");
	}
}