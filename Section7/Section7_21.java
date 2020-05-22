import java.util.Scanner;
class Section7_21 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.print("配列aの要素数：");
		int n=stdIn.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			System.out.print("a["+i+"]：");
			a[i]=stdIn.nextInt();
		}
		System.out.print("配列bの要素数：");
		int m=stdIn.nextInt();
		int[] b=new int[m];
		for(int j=0;j<m;j++){
			System.out.print("b["+j+"]：");
			b[j]=stdIn.nextInt();
		}
		aryExchng(a,b);
		System.out.println("値を交換しました");
		for(int s=0;s<n;s++){
			System.out.println("a["+s+"]="+a[s]);
		}
		for(int t=0;t<m;t++){
			System.out.println("b["+t+"]="+b[t]);
		}
	}
	
	static void aryExchng(int[] a,int[] b){
		for(int i=0;i<(b.length>a.length?a.length:b.length);i++){
			int t=a[i];
			a[i]=b[i];
			b[i]=t;
		}
	}	
	
}
