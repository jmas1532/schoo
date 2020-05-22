import java.util.Scanner;

public class Section15_1 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.print("•¶Žš—ñ:");
		String s=stdIn.next();
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}

	}

}
