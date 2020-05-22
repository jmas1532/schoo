import java.util.Random;
import java.util.Scanner;

class Section6_4 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		System.out.print("—v‘f”F");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		
		for(int p=0;p<n;p++){
			a[p]=1+rand.nextInt(n);
		}

		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if((a[j]-n+i)>=0){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int s=0;s<n;s++){
			System.out.print("-");
		}
		System.out.println();
		for(int t=0;t<n;t++){
			System.out.print(t%10);
		}
		System.out.println();
	}
}