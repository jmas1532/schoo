import java.util.Scanner;

class Section6_8 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("要素数は：");
		int n =stdIn.nextInt();
		double[] a=new double[n];
		double sum=0.0;
		double ave;
		for(double i:a){
			System.out.print("値は：");
			 i=stdIn.nextDouble();
			sum+=i;
		}
		ave=sum/n;
		System.out.println("合計値は"+sum+"です。");
		System.out.println("平均値は"+ave+"です。");
	}
}
