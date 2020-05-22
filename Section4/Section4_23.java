import java.util.Scanner;

public class Section4_23 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		
		
		System.out.print("’i”‚ÍF");
		int n=stdIn.nextInt();
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=(2*n-1);j++){
				if(j<=(n-i)||j>=(n+i)){
					System.out.print(" ");
				}else{
					System.out.print(i%10);
				}
			}
			System.out.println();
		}
	}
}