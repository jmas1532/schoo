import java.util.Random;
import java.util.Scanner;

class Section6_9 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		System.out.print("—v‘f”‚ÍF");
		int n=stdIn.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=rand.nextInt(10)+1;
		}
			System.out.print("a={");
		for( int j=0;j<(n-1);j++){
			if(j!=n){
				System.out.print(a[j]+",");
			}
		}
		System.out.println(a[n-1]+"}");
		
	}
}