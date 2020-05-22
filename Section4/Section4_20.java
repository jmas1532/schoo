import java.util.Scanner;

public class Section4_20 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("âΩíiÇ…ÇµÇ‹Ç∑Ç©ÅF");
		int n=stdIn.nextInt();
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}