import java.util.Scanner;
class Section7_24 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.print("�z��a�̗v�f���F");
		int n=stdIn.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			System.out.print("a["+i+"]�F");
			a[i]=stdIn.nextInt();
		}
		System.out.print("�폜����v�f�F");
		int idx=stdIn.nextInt();
		int[] c=arrayRmvOf(a,idx);
		System.out.println("�폜���܂���");
		for(int j=0;j<c.length;j++){
				System.out.println("c["+j+"]="+c[j]);
		}
	}
	static int[] arrayRmvOf(int[] a,int idx){
		int[] b=new int[a.length-1];
		for(int i=0;i<b.length;i++){
			b[i]=i>=idx?a[i+1]:a[i];
		}
		return b;
	}
}