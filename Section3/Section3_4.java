import java.util.Scanner;

public class Section3_4 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);

		System.out.print("���lA�F�@");
		double a=stdIn.nextDouble();
	
		System.out.print("���lB�F�@");
		double b=stdIn.nextDouble();
	
		if(a>b){
			System.out.println("���lA�̂ق����傫���ł�");
		}else if(a<b){
			System.out.println("���lB�̂ق����傫���ł�");
		}else{
			System.out.println("���lA�Ɛ��lB�͓����l�ł�");
		}
	}
}