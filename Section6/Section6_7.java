import java.util.Random;
import java.util.Scanner;

class Section6_7 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		final int n = 12;
		int[] a = new int[n];

		for (int j = 0; j < n; j++)
			a[j] = rand.nextInt(10);

		System.out.print("�z��a�̑S�v�f�̒l\n{ ");
		for (int j = 0; j < n; j++)
			System.out.print(a[j] + " ");
		System.out.println(" }");

		System.out.print("�T�����l�F");
		int key = stdIn.nextInt();

		int i;
		for (i = 0; i < n; i++)
			if (a[i] == key)
				break;

		if (i < n){
			int x=i;
			for(int j=i;j<n;j++){
				if(a[j]==key){
					x=j;
				}
			}
			System.out.println("�����a[" + x + "]�ɂ���܂��B");
		}else
			System.out.println("����͂���܂���B");			
	}
}
