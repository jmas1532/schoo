import java.util.Scanner;

public class Section3_2 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);

		System.out.print("整数A：　");
		int a=stdIn.nextInt();
		
		System.out.print("整数B：　");
		int b=stdIn.nextInt();
		
		if(a%b==0){
			System.out.println(b+"は"+a+"の約数です。");
		}else{
			System.out.println(b+"は"+a+"の約数ではありません。");
		}
	}
}