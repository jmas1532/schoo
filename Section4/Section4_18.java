import java.util.Scanner;

public class Section4_18 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);

		System.out.print("n�̒l�F");
		int n=stdIn.nextInt();
		
		for(int i=1;i<=n;i++){
			System.out.println(i+"��2���"+i*i);
		}
	}
}