import java.util.Scanner;
class Section7_19 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.print("要素数：");
		int x=stdIn.nextInt();
		int[] a=new int[x];
		for(int i=0;i<x;i++){
			System.out.print("a["+i+"]：");
			a[i]=stdIn.nextInt();
		}
		System.out.print("削除を開始する要素は：");
		int idx=stdIn.nextInt();
		System.out.print("何個削除しますか：");
		int n=stdIn.nextInt();
		aryRmvN(a,idx,n);
		if(n>1){
			System.out.println("a["+idx+"]からa["+(idx+n-1)+"]まで削除しました");
		}else if(n==1){
			System.out.println("a["+idx+"]を削除しました");
		}
		for(int j=0;j<x;j++){
			System.out.println("a["+j+"]="+a[j]);
		}
	}
	
	static void aryRmvN(int[] a,int idx,int n){
		for(int i=idx;i<idx+n;i++){
			if(i+n>=a.length) break;
			a[i]=a[i+n];
		}
	}
	
}
