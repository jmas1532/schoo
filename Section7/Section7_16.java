import java.util.Scanner;
class Section7_16 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.print("�v�f���F");
		int n=stdIn.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			System.out.print("a["+i+"]�F");
			a[i]=stdIn.nextInt();
		}
		System.out.println("�ŏ��l�F"+minOf(a));
	}
	
	static int minOf(int[] a){
		int min=a[0];
		for(int j=1;j<a.length;j++){
			if(min>a[j]) min=a[j];
		}
		return min;
	}
	
}
