import java.util.Random;
import java.util.Scanner;

class Section7_10 {

	static Scanner stdIn = new Scanner(System.in);
	static Random rand = new Random();
	static boolean confirmRetry() {
		int cont;
		do {
			System.out.print("������x�H<Yes�c1�^No�c0>�F");
			cont = stdIn.nextInt();
		} while (cont != 0 && cont != 1);
		return cont == 1; 
	}
	
	static int minus(){
		int i=rand.nextInt(2);
		if(i==0){
			return -1;
		}else{
			return 1;
		}
	}

	public static void main(String[] args) {
		

		System.out.println("�ÎZ�̓g���[�j���O!!");
		do {
			int x = rand.nextInt(900) + 100;
			int y = minus()*(rand.nextInt(900) + 100);
			int z = minus()*(rand.nextInt(900) + 100);

			while (true) {
				System.out.print(x);
				if(y<0){
					System.out.print(y);
				}else{
					System.out.print("+"+y);
				}
				if(z<0){
					System.out.print(z+"=");
				}else{
					System.out.print("+"+z+"=");
				}
				int k = stdIn.nextInt();
				if (k == x + y + z)	
					break;
				System.out.println("�Ⴂ�܂���!!");
			}
		} while (confirmRetry());
	}
}
