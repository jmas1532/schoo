import java.util.Scanner;

public class Section4_7 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);

		System.out.print("‰½ŒÂ*‚ğ•\¦‚µ‚Ü‚·‚©F");
		int n=stdIn.nextInt();
		
		int i=0;
		
		while(i<n){
			System.out.print('*');
			i++;
			if(i%2==1&&i<n){
				System.out.print('+');
				i++;
			}else{
				i++;
			}
		}
		if(n>=1){
			System.out.println();
		}
		
		
	}
}