import java.util.Scanner;
class Section7_28 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.print("行数：");
		int n=stdIn.nextInt();
		System.out.print("列数：");
		int m=stdIn.nextInt();
		int[][] x=new int[n][m];
		int[][] y=new int[n][m];
		
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				System.out.print("x["+i+"]["+j+"]=");
				x[i][j]=stdIn.nextInt();
				System.out.print("y["+i+"]["+j+"]=");
				y[i][j]=stdIn.nextInt();
			}
		}
		
		int[][] z=addMatrix(x,y);
		System.out.println("行列x+y");
		for(int s=0;s<n;s++){
			for(int t=0;t<m;t++){
				System.out.print(z[s][t]+" ");	
			}
			System.out.println();
		}
	}
	static int[][] addMatrix (int[][] x,int[][] y){
		int[][] z=new int[x.length][x[0].length];
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x[0].length;j++){
				z[i][j]=x[i][j]+y[i][j];
			}
		}
		return z;
	}
}