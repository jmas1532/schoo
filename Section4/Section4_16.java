import java.util.Scanner;

public class Section4_16 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);

		System.out.print("‰½ŒÂ*‚ğ•\¦‚µ‚Ü‚·‚©F");
		int x=stdIn.nextInt();
		
		for(int i=1;i<=x;i++){
			System.out.print("*");
			if(i%5==0){
				System.out.println();
			}
		}
	}
}