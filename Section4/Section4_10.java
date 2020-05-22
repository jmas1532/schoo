import java.util.Scanner;

public class Section4_10 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);

		System.out.print("‰½ŒÂ‚Ì*‚ğ•\¦‚µ‚Ü‚·‚©F");
		int n=stdIn.nextInt();
		
		for(int i=0;i<n;i++)
			System.out.print('*');
		if(!(n<1))
			System.out.println();
		
	}
}