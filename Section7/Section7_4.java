import java.util.Scanner;

class Section7_4 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("n‚Ì’lF");
		int n=stdIn.nextInt();
		System.out.println("®”˜aF"+sumUp(n));

	}
	
	static int sumUp(int a){
		int sumUp=0;
		while(a>0){
			sumUp+=a;
			a--;
		}
		return sumUp;
	}
}