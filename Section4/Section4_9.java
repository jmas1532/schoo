import java.util.Scanner;

public class Section4_9 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);

		System.out.print("n�̒l�F");
		int n=stdIn.nextInt();
		int x=1;
		int y=1;
		while(x<=n){
			y*=x;
			x++;
		}
		System.out.println("1����"+n+"�܂ł̐ς�"+y+"�ł��B");
		
	}
}