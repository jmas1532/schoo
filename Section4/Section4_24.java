import java.util.Scanner;

public class Section4_24 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		
		
		System.out.print("正の整数値：");
		int n=stdIn.nextInt();
		
		for(int i=2;i<=n;i++){
			if(i==n){
				System.out.println("素数です");
			}else if(n%i==0){
				System.out.println("素数ではありません");
				break;
			}
		}
			
	}
}