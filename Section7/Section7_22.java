import java.util.Scanner;
class Section7_22 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.print("�z��a�̗v�f���F");
		int n=stdIn.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			System.out.print("a["+i+"]�F");
			a[i]=stdIn.nextInt();
		}
		
		int[] c=arrayClone(a);
		System.out.println("�����z��𐶐����܂���");
		for(int j=0;j<c.length;j++){
			System.out.println("a["+j+"]="+c[j]);
		}
	}
	
	static int[] arrayClone(int[] a){
		int[] b=new int[a.length];
		for(int i=0;i<b.length;i++){
			b[i]=a[i];
		}
		return b;
	}
}
