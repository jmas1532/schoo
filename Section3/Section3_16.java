import java.util.Scanner;

public class Section3_16 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);

		System.out.print("����A�F�@");
		int a=stdIn.nextInt();

		System.out.print("����B�F�@");
		int b=stdIn.nextInt();
		
		System.out.print("����C�F�@");
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
		System.out.println("�����Ƀ\�[�g���܂����B");
		System.out.println("����A��"+a+"�ł�");
		System.out.println("����B��"+b+"�ł�");
		System.out.println("����C��"+c+"�ł�");
	}
}