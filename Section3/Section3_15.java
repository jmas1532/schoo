import java.util.Scanner;

public class Section3_15 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);

		System.out.print("����A�F�@");
		int a=stdIn.nextInt();

		System.out.print("����B�F�@");
		int b=stdIn.nextInt();
		
		
		if(b>a){
			int t=a;
			a=b;
			b=t;
		}
		System.out.println("a��b�ƂȂ�悤�Ƀ\�[�g���܂����B");
		System.out.println("����A��"+a+"�ł�");
		System.out.println("����B��"+b+"�ł�");
	}
}