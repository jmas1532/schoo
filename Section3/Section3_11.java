import java.util.Scanner;

public class Section3_11 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);

		System.out.print("����A�F�@");
		int a=stdIn.nextInt();

		System.out.print("����B�F�@");
		int b=stdIn.nextInt();
		
		int max=a>=b?a:b;
		int min=a<b?a:b; 
		
		if((max-min)<=10){
			System.out.println("�����̍���10�ȉ��ł��B");
		}else{
			System.out.println("�����̍���11�ȏ�ł�");
		}
	
	}
}