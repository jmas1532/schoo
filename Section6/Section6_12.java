import java.util.Random;
import java.util.Scanner;

class Section6_12 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		int count;
		do{
			System.out.print("要素数（10以下の整数）：");
			n=stdIn.nextInt();
		}while(n<1||n>10);
		
		int[] a=new int[n];
		
		for(int p=0;p<n;p++){
			System.out.print("a["+p+"]：");
			a[p]=stdIn.nextInt();
		}
			
		int x=0;
		int[] b=new int[n];
		b[0]=rand.nextInt(n);
		for(int i=1;i<n;i++){		
			C:
			do{
				x=rand.nextInt(n);
				for(int m=0;m<i;m++){
					if(b[m]==x){
						continue C;
					}
				}
				break;
			}while(true);
			b[i]=x;
		}
		int[] c=new int[n];
		System.out.println("並び変えて表示します");
		System.out.print("a={");
		for(int s=0;s<n;s++){
			c[s]=a[b[s]];
			if(s<n-1){
				System.out.print(c[s]+",");
			}else{
				System.out.println(c[n-1]+"}");
			}
		}
		
	}

	
}