import java.util.Scanner;

class Section6_13 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�v�f���F");
		int n=stdIn.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		
		for(int i=0;i<n;i++){
			System.out.print("a["+i+"]�F");
			a[i]=stdIn.nextInt();
		}
		for(int j=0;j<n;j++){
			b[j]=a[n-j-1];
		}
		System.out.println("a�̑S�v�f��b�ɑ΂��t���ɃR�s�[���܂����B");
		for(int m=0;m<n;m++){
			System.out.println("b["+m+"]�F"+b[m]);
		}

	}
}