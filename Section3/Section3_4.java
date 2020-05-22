import java.util.Scanner;

public class Section3_4 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);

		System.out.print("数値A：　");
		double a=stdIn.nextDouble();
	
		System.out.print("数値B：　");
		double b=stdIn.nextDouble();
	
		if(a>b){
			System.out.println("数値Aのほうが大きいです");
		}else if(a<b){
			System.out.println("数値Bのほうが大きいです");
		}else{
			System.out.println("数値Aと数値Bは同じ値です");
		}
	}
}