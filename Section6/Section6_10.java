import java.util.Random;
import java.util.Scanner;

class Section6_10 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		System.out.print("—v‘f”‚ÍF");
		int n=stdIn.nextInt();
		int[] a=new int[n];
		int x=0;
		a[0]=rand.nextInt(10)+1;
		for(int i=1;i<n;i++){		
			
			do{	
				x=rand.nextInt(10)+1;
				
			}while(x==a[i-1]);
			a[i]=x;
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