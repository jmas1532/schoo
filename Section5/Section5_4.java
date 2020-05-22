import java.util.Scanner;

class Section5_4 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("3つの数の合計と平均を求めます");
		System.out.print("1つ目：");
		int x=stdIn.nextInt();
		System.out.print("2つ目：");
		int y=stdIn.nextInt();
		System.out.print("3つ目：");
		int z=stdIn.nextInt();
		
		int sum=x+y+z;
		double ave=(x+y+z)/3.0;
		System.out.println("合計："+sum);
		System.out.println("平均："+ave);

		
	}
}
