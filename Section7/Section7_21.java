import java.util.Scanner;
class Section7_21 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.print("�z��a�̗v�f���F");
		int n=stdIn.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			System.out.print("a["+i+"]�F");
			a[i]=stdIn.nextInt();
		}
		System.out.print("�z��b�̗v�f���F");
		int m=stdIn.nextInt();
		int[] b=new int[m];
		for(int j=0;j<m;j++){
			System.out.print("b["+j+"]�F");
			b[j]=stdIn.nextInt();
		}
		aryExchng(a,b);
		System.out.println("�l���������܂���");
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
