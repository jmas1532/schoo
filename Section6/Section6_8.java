import java.util.Scanner;

class Section6_8 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�v�f���́F");
		int n =stdIn.nextInt();
		double[] a=new double[n];
		double sum=0.0;
		double ave;
		for(double i:a){
			System.out.print("�l�́F");
			 i=stdIn.nextDouble();
			sum+=i;
		}
		ave=sum/n;
		System.out.println("���v�l��"+sum+"�ł��B");
		System.out.println("���ϒl��"+ave+"�ł��B");
	}
}
