import java.util.Scanner;
class Section7_18 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.print("要素数：");
		int n=stdIn.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			System.out.print("a["+i+"]：");
			a[i]=stdIn.nextInt();
		}
		System.out.print("削除する要素は：");
		int idx=stdIn.nextInt();
		aryRmv(a,idx);
		System.out.println("a["+idx+"]を削除しました");
		for(int j=0;j<n;j++){
			System.out.println("a["+j+"]="+a[j]);
		}
	}
	
	static void aryRmv(int[] a,int idx){
		for(int i=idx;i<a.length-1;i++){
			a[i]=a[i+1];
		}
	}
	
}
