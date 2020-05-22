import java.util.Scanner;

class Section5_2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("変数xはfloat型で、変数yはdouble型です。");
		System.out.print("x：");
		float n=stdIn.nextFloat();
		System.out.print("y：");
		double m=stdIn.nextDouble();
		
		System.out.println("x="+n);
		System.out.println("y="+m);

		
	}
}
