import java.util.Scanner;

public class Section3_14 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);

		System.out.print("����A�F�@");
		int a=stdIn.nextInt();

		System.out.print("����B�F�@");
		int b=stdIn.nextInt();
		
		int min,max;
		
		if(a>b){
			max=a;
			min=b;
		}else{
			max=b;
			min=a;
		}
		if(a==b){
			System.out.println("��̒l�͓����ł�");
		}else{
			System.out.println("�������ق��̒l��"+min);
			System.out.println("�傫���ق��̒l��"+max);
		}
	}
}