import java.util.Scanner;

public class Section4_10 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);

		System.out.print("何個の*を表示しますか：");
		int n=stdIn.nextInt();
		
		for(int i=0;i<n;i++)
			System.out.print('*');
		if(!(n<1))
			System.out.println();
		
	}
}