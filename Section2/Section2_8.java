import java.util.Random;
import java.util.Scanner;

public class Section2_8 {
	public static void main(String[] args) {
		Random rand=new Random();
		Scanner stdIn=new Scanner(System.in);
		
		int lucky=rand.nextInt(11)-5;
		
		System.out.print("�����l�F");
		System.out.println("���̒l�́}5���̗����𐶐����܂����B\n�����"+(stdIn.nextInt()+lucky)+"�ł��B");
	}
}