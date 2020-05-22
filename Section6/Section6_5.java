import java.util.Scanner;

class Section6_5 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("—v‘f”F");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		
		for(int i=0;i<n;i++){
				System.out.print("a["+i+"]F");
				a[i] = stdIn.nextInt();
		}
		System.out.print("a={");
		for(int j=0;j<(n-1);j++){
			System.out.print(a[j]+",");
		}
		System.out.println(a[n-1]+"}");
	}
}