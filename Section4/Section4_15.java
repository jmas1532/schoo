import java.util.Scanner;

public class Section4_15 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);

		System.out.print("��cm����F");
		int x=stdIn.nextInt();
		
		System.out.print("��cm�܂ŁF");
		int y=stdIn.nextInt();
		
		System.out.print("��cm���ƁF");
		int z=stdIn.nextInt();
		
		double w;
		
		System.out.println("�g��"+"�@"+"�W���̏d");
		for(int i=x;i<=y;i+=z){
			w=(i-100)*0.9;
			System.out.println(i+"�@"+w);
		}
	}
}