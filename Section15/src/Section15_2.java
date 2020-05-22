import java.util.Scanner;

public class Section15_2 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.print("•¶Žš—ñ:");
		String s=stdIn.next();
		for(int i=0;i<s.length();i++) {
			System.out.println("s["+i+"]="+s.codePointAt(i));
		}

	}

}
