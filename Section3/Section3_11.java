import java.util.Scanner;

public class Section3_11 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);

		System.out.print("整数A：　");
		int a=stdIn.nextInt();

		System.out.print("整数B：　");
		int b=stdIn.nextInt();
		
		int max=a>=b?a:b;
		int min=a<b?a:b; 
		
		if((max-min)<=10){
			System.out.println("それらの差は10以下です。");
		}else{
			System.out.println("それらの差は11以上です");
		}
	
	}
}