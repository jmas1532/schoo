import java.util.Scanner;

public class Section3_3 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);

		System.out.print("�����l�F�@");
		int n=stdIn.nextInt();
	
		
		if(n>0){
			System.out.println("���̒l�͐��ł�");
		}else if(n<0){
			System.out.println("���̒l�͕��ł�");
		}else if(n==0){
			System.out.println("���̒l��0�ł�");
		}
	}
}