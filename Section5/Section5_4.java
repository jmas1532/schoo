import java.util.Scanner;

class Section5_4 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("3�̐��̍��v�ƕ��ς����߂܂�");
		System.out.print("1�ځF");
		int x=stdIn.nextInt();
		System.out.print("2�ځF");
		int y=stdIn.nextInt();
		System.out.print("3�ځF");
		int z=stdIn.nextInt();
		
		int sum=x+y+z;
		double ave=(x+y+z)/3.0;
		System.out.println("���v�F"+sum);
		System.out.println("���ρF"+ave);

		
	}
}
