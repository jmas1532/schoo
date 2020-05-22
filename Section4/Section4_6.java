import java.util.Scanner;

public class Section4_6 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);

		System.out.print("‰½ŒÂ*‚ğ•\¦‚µ‚Ü‚·‚©F");
		int n=stdIn.nextInt();
		
		int i=0;
		//List4-7
		while(i<n){
			System.out.print('*');
			i++;
		}
		if(n>=1){
			System.out.println();
		}
		
		//List4-8
		int j=1;
		while(j<=n){
			System.out.print('*');
			j++;
		}
		if(n>=1){
			System.out.println();
		}
	}
}