import java.util.Scanner;
class Section7_15 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.print("�v�f���F");
		int n=stdIn.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			System.out.print("a["+i+"]�F");
			a[i]=stdIn.nextInt();
		}
		System.out.println("���v�l�F"+sumOf(a));
	}
	
	static int sumOf(int[] a){
		int sum=0;
		for(int j=0;j<a.length;j++){
			sum+=a[j];
		}
		return sum;
	}
	
}
