import java.util.Scanner;

public class Section3_13 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);

		System.out.print("整数A：　");
		int a=stdIn.nextInt();

		System.out.print("整数B：　");
		int b=stdIn.nextInt();
		
		
		System.out.print("整数C：　");
		int c=stdIn.nextInt();
		
		int min =a;
		int max=a;
		int bet;
		
		if(b<a){
			min=b;
		}else{
			max=b;
		}
		if(c<min){
			bet=min;
		}else{
			if(c<max){
				bet=c;
			}else{
				bet=max;
			}
		}
		System.out.println("中央値は"+bet);
	}
}