import java.util.Scanner;

class Section7_7 {

	static void putStars(int n) {
		for (int i = 1; i <= n; i++) {
			putChars('+',i);
			System.out.println();
		}
	}
	static void putChars(char c, int n) {
		while (n-- > 0)
			System.out.print(c);
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("�������p�̎O�p�`��\�����܂��B");
		System.out.print("�i���́F");
		int n = stdIn.nextInt();
		putStars(n);
	}
}
