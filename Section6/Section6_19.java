import java.util.Scanner;

class Section6_19 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("�N���X���F");
		int n=stdIn.nextInt();
		int[][] c=new int[n][];
		int[] sum=new int[n];
		double[] ave=new double[n];
		int count=0;
		for(int i=0;i<n;i++){
			System.out.print(i+1+"�g�̐l���F");
			int m=stdIn.nextInt();
			c[i]=new int[m];
			sum[i]=0;
			count+=m;
			for(int j=0;j<m;j++){
				System.out.print(i+1+"�g"+(j+1)+"�Ԃ̓_���F");
				c[i][j]=stdIn.nextInt();
				sum[i]+=c[i][j];
			}
			ave[i]=(double)sum[i]/n;
			System.out.println();
		}
		int sumTotal=0;
		for(int s=0;s<n;s++){
			sumTotal+=sum[s];
		}
		System.out.printf("%3s |  %3s  %3s\n","�g","���v","����");
		System.out.println("-----+---------------");
		for(int l=0;l<n;l++){
			System.out.printf("%2d�g |    %3d   %4.1f\n",l+1,sum[l],ave[l]);
		}
		System.out.println("-----+---------------");
		System.out.printf("%3s |    %3d   %4.1f\n","�v",sumTotal,(double)sumTotal/count);
	}
}