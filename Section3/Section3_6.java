import java.util.Scanner;

public class Section3_6 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);

		System.out.print("�����l�F�@");
		int a=stdIn.nextInt();

	
		if(a<=0){
			System.out.println("���łȂ��l�����͂���܂����B");
		}else{
			if(a%10==0){
				System.out.println("���̒l��10�̔{���ł��B");
			}else{
			System.out.println("���̒l��10�̔{���ł͂���܂���");
			}
		}
	}
}