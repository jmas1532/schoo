import java.util.Scanner;

class Section6_18 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("行数：");
		int x=stdIn.nextInt();
		int[][] a=new int[x][];
		for(int i=0;i<x;i++){
			System.out.print(i+1+"行目の列数：");
			a[i]=new int[stdIn.nextInt()];
		}
		System.out.println("値を入力してください");
		for(int j=0;j<x;j++){
			for(int m=0;m<a[j].length;m++){
				System.out.print(j+1+"行"+(m+1)+"列目の値：");
				a[j][m]=stdIn.nextInt();
			}
		}
		for(int l=0;l<x;l++){
			for(int s=0;s<a[l].length;s++){
				System.out.printf("%3d",a[l][s]);
			}
			System.out.println();
		}
	}
}