import java.util.Scanner;

class Section6_17 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a[][]=new int[6][2];
		int sumSubJ=0;
		int sumSubM=0;
		for(int i=0;i<6;i++){
			System.out.print("生徒["+(i+1)+"]国語：");
			a[i][0]=stdIn.nextInt();
			sumSubJ+=a[i][0];
			System.out.print("生徒["+(i+1)+"]数学：");
			a[i][1]=stdIn.nextInt();
			sumSubM+=a[i][1];
		}
		System.out.printf("国語平均点：%.2f\n",sumSubJ/6.0);
		System.out.printf("数学平均点：%.2f\n",sumSubM/6.0);
		for(int j=0;j<6;j++){
			System.out.println("生徒["+(j+1)+"]平均点："+(a[j][0]+a[j][1])/2.0);
		}
	}
}