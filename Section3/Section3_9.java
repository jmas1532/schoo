import java.util.Scanner;

public class Section3_9 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);

		System.out.print("���lA�F�@");
		double a=stdIn.nextDouble();

		System.out.print("���lB�F�@");
		double b=stdIn.nextDouble();
		
		double max=a>=b?a:b;
		System.out.println(max);
	
	}
}