import java.util.Random;
import java.util.Scanner;

class Section6_11 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		do{
		System.out.print("要素数（10以下の整数）：");
		n=stdIn.nextInt();
		}while(n<1||n>10);
		
		int[] a=new int[n];
		int x=0;
		a[0]=rand.nextInt(10)+1;
		
		for(int i=1;i<n;i++){		
			C:
			do{
				x=rand.nextInt(10)+1;
				for(int m=0;m<i;m++){
					if(a[m]==x){
						continue C;
					}
				}
				break;
			}while(true);
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