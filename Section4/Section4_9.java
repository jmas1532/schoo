import java.util.Scanner;

public class Section4_9 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);

		System.out.print("n‚Ì’lF");
		int n=stdIn.nextInt();
		int x=1;
		int y=1;
		while(x<=n){
			y*=x;
			x++;
		}
		System.out.println("1‚©‚ç"+n+"‚Ü‚Å‚ÌÏ‚Í"+y+"‚Å‚·B");
		
	}
}