import java.util.Scanner;

public class Section2_6 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		
		System.out.println("�O�p�`�̖ʐς����߂܂�");

		System.out.print("��ӁF�@");
		double x=stdIn.nextDouble();
		
		System.out.print("�����F�@");
		double y=stdIn.nextDouble();

		System.out.println("�ʐς�"+x*y/2+"�ł��B");
	}
}