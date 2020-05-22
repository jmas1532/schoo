import java.util.Scanner;
class Section7_20 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.print("要素数：");
		int n=stdIn.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			System.out.print("a["+i+"]：");
			a[i]=stdIn.nextInt();
		}
		System.out.print("挿入する要素は：");
		int idx=stdIn.nextInt();
		System.out.print("挿入する値：");
		int x=stdIn.nextInt();
		aryIns(a,idx,x);
		System.out.println("a["+idx+"]に"+x+"を挿入しました");
		for(int j=0;j<n;j++){
			System.out.println("a["+j+"]="+a[j]);
		}
	}
	
	static void aryIns(int[] a,int idx,int x){
		for(int i=a.length-1;i>idx;i--){
			a[i]=a[i-1];
		}
		a[idx]=x;
	}	
	
}
