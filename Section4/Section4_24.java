import java.util.Scanner;

public class Section4_24 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		
		
		System.out.print("³‚Ì®”’lF");
		int n=stdIn.nextInt();
		
		for(int i=2;i<=n;i++){
			if(i==n){
				System.out.println("‘f”‚Å‚·");
			}else if(n%i==0){
				System.out.println("‘f”‚Å‚Í‚ ‚è‚Ü‚¹‚ñ");
				break;
			}
		}
			
	}
}