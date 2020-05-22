import java.util.Scanner;
class Section7_25 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.print("配列aの要素数：");
		int n=stdIn.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			System.out.print("a["+i+"]：");
			a[i]=stdIn.nextInt();
		}
		System.out.print("削除開始要素：");
		int idx=stdIn.nextInt();
		System.out.print("削除数：");
		int m=stdIn.nextInt();
		int[] c=arrayRmvOfN(a,idx,m);
		System.out.println("削除しました");
		for(int j=0;j<c.length;j++){
				System.out.println("c["+j+"]="+c[j]);
		}
	}
	static int[] arrayRmvOfN(int[] a,int idx,int n){
		int[] b=new int[a.length-n];
		for(int i=0;i<b.length;i++){
			b[i]=i>=idx?a[i+n]:a[i];
		}
		return b;
	}
}