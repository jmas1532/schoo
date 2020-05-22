import java.util.Scanner;

public class Section4_8 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);

		System.out.print("整数値：");
		int n=stdIn.nextInt();
		int x=1;
		while(n>=10){
			n/=10;
			x++;
		}
		System.out.println("その値は"+x+"桁です。");
		
	}
}