import java.util.Scanner;

public class Section4_15 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);

		System.out.print("何cmから：");
		int x=stdIn.nextInt();
		
		System.out.print("何cmまで：");
		int y=stdIn.nextInt();
		
		System.out.print("何cmごと：");
		int z=stdIn.nextInt();
		
		double w;
		
		System.out.println("身長"+"　"+"標準体重");
		for(int i=x;i<=y;i+=z){
			w=(i-100)*0.9;
			System.out.println(i+"　"+w);
		}
	}
}