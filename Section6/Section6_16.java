import java.util.Scanner;

class Section6_16 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("行列a、bの要素を入力してください");
		int[][] a=new int[4][3];
		int[][] b=new int[3][4];
		int[][] c=new int[4][4];
		
		for(int i=0;i<4;i++){
			for(int j=0;j<3;j++){
				System.out.print("a["+i+"]["+j+"]：");
				a[i][j]=stdIn.nextInt();
			}
		}
		for(int m=0;m<3;m++){
			for(int n=0;n<4;n++){
				System.out.print("b["+m+"]["+n+"]：");
				b[m][n]=stdIn.nextInt();
			}
		}
		System.out.println("行列a");
		for(int l=0;l<4;l++){
			for(int s=0;s<3;s++){
				System.out.printf("%3d",a[l][s]);
			}
			System.out.println();
		}
		System.out.println("行列b");
		for(int p=0;p<3;p++){
			for(int q=0;q<4;q++){
				System.out.printf("%3d",b[p][q]);
			}
			System.out.println();
		}
		System.out.println("行列a×行列b");
		for(int z=0;z<4;z++){
			for(int h=0;h<4;h++){
				for(int k=0;k<3;k++)
					c[z][h]+=a[z][k]*b[k][h];
			}
		}
		for(int d=0;d<4;d++){
			for(int f=0;f<4;f++){
				System.out.printf("%3d",c[d][f]);
			}
			System.out.println();
		}
	}
}