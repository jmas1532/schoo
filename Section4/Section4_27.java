import java.util.Random;
import java.util.Scanner;

class Section4_27 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		int no = rand.nextInt(100);

		System.out.println("�����ăQ�[���J�n!!");
		System.out.println("0�`99�̐��𓖂ĂĂ��������B");

		int x=0;
		int y=0;
		int a=6;//����
		do {
			
			System.out.print("�������ȁF");
			x = stdIn.nextInt();
			y++;
			if(y==a) break;
			if (x > no)
				System.out.println("�����Ə����Ȑ�����B");
			else if (x < no)
				System.out.println("�����Ƒ傫�Ȑ�����B");
		} while (x != no);
		if(y==a){
			System.out.println("������"+no+"�ł��B");
		}else{
			System.out.println("�����ł��B");
		}
	}
}
