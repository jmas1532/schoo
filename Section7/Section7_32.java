
import java.util.Scanner;
class Section7_32 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.println("1:byte 2:short 3:int 4:long");
		System.out.print("番号で選んでください:");
		switch(stdIn.nextInt()){
			case 1:
				System.out.print("xの値：");
				printBits(stdIn.nextByte());
				break;
			case 2:
				System.out.print("xの値：");
				printBits(stdIn.nextShort());
				break;
			case 3:
				System.out.print("xの値：");
				printBits(stdIn.nextInt());
				break;
			case 4:
				System.out.print("xの値：");
				printBits(stdIn.nextLong());
				break;
		}
	}
	static void printBits(byte x) {
		for (int i = 7; i >= 0; i--)
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
	}
	static void printBits(short x) {
		for (int i = 15; i >= 0; i--)
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
	}
	static void printBits(int x) {
		for (int i = 31; i >= 0; i--)
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
	}
	static void printBits(long x) {
		for (int i = 63; i >= 0; i--)
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
	}
	
}