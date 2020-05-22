import java.util.Scanner;
class Section7_20 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.print("—v‘f”F");
		int n=stdIn.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			System.out.print("a["+i+"]F");
			a[i]=stdIn.nextInt();
		}
		System.out.print("‘}“ü‚·‚é—v‘f‚ÍF");
		int idx=stdIn.nextInt();
		System.out.print("‘}“ü‚·‚é’lF");
		int x=stdIn.nextInt();
		aryIns(a,idx,x);
		System.out.println("a["+idx+"]‚É"+x+"‚ğ‘}“ü‚µ‚Ü‚µ‚½");
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
