import java.util.Scanner;

public class Section3_10 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);

		System.out.print("数値A：　");
		double a=stdIn.nextDouble();

		System.out.print("数値B：　");
		double b=stdIn.nextDouble();
		
		double max=a>=b?a:b;
		double min=a<b?a:b; 
		System.out.println(max-min);
	
	}
}