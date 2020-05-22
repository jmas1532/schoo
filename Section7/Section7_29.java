import java.util.Scanner;
class Section7_29 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.print("配列aの要素数：");
		int[][] a=new int[stdIn.nextInt()][];
		for(int i=0;i<a.length;i++){
			System.out.print("a["+i+"]の要素数：");
			a[i]=new int[stdIn.nextInt()];
		}
		for(int j=0;j<a.length;j++){
			for(int s=0;s<a[j].length;s++){
				System.out.print("a["+j+"]["+s+"]：");
				a[j][s]=stdIn.nextInt();
			}
		}
		int[][] y=aryClone2(a);
		System.out.println("コピーしました");
		for(int p=0;p<y.length;p++){
			for(int q=0;q<y[p].length;q++){
					System.out.println("a["+p+"]["+q+"]="+y[p][q]);
			}
		}
	}
	static int[][] aryClone2(int[][] a){
		int[][] b=new int[a.length][];
		for(int t=0;t<a.length;t++){
			b[t]=new int[a[t].length];
			for(int m=0;m<a[t].length;m++){
				b[t][m]=a[t][m];
			}
		}
		
		return b;
	}
}