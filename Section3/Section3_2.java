import java.util.Scanner;

public class Section3_2 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);

		System.out.print("����A�F�@");
		int a=stdIn.nextInt();
		
		System.out.print("����B�F�@");
		int b=stdIn.nextInt();
		
		if(a%b==0){
			System.out.println(b+"��"+a+"�̖񐔂ł��B");
		}else{
			System.out.println(b+"��"+a+"�̖񐔂ł͂���܂���B");
		}
	}
}