import java.util.Scanner;

class Section6_17 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a[][]=new int[6][2];
		int sumSubJ=0;
		int sumSubM=0;
		for(int i=0;i<6;i++){
			System.out.print("���k["+(i+1)+"]����F");
			a[i][0]=stdIn.nextInt();
			sumSubJ+=a[i][0];
			System.out.print("���k["+(i+1)+"]���w�F");
			a[i][1]=stdIn.nextInt();
			sumSubM+=a[i][1];
		}
		System.out.printf("���ꕽ�ϓ_�F%.2f\n",sumSubJ/6.0);
		System.out.printf("���w���ϓ_�F%.2f\n",sumSubM/6.0);
		for(int j=0;j<6;j++){
			System.out.println("���k["+(j+1)+"]���ϓ_�F"+(a[j][0]+a[j][1])/2.0);
		}
	}
}