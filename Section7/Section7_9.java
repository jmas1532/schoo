import java.util.Scanner;

class Section7_9 {
	static Scanner stdIn = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println(readPlusInt());
	}
	
	static int readPlusInt(){
		int n;
		do{
			System.out.print("正の整数値：");
			n=stdIn.nextInt();
		}while(n<=0);
		return n;
	}
}
