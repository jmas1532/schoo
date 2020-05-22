import java.util.Scanner;
class Section7_26 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.print("配列aの要素数：");
		int n=stdIn.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			System.out.print("a["+i+"]：");
			a[i]=stdIn.nextInt();
		}
		System.out.print("追加インデックス番号：");
		int idx=stdIn.nextInt();
		System.out.print("追加する値：");
		int m=stdIn.nextInt();
		int[] c=arrayInsOf(a,idx,m);
		System.out.println("追加しました");
		for(int j=0;j<c.length;j++){
				System.out.println("c["+j+"]="+c[j]);
		}
	}
	static int[] arrayInsOf(int[] a,int idx,int x){
		int[] b=new int[a.length+1];
		for(int i=0;i<b.length;i++){
			b[i]=i>=idx?(i==idx?x:a[i-1]):a[i];
		}
		return b;
	}
}