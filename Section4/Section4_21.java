import java.util.Scanner;

public class Section4_21 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		
		
		System.out.print("段数は：");
		int n=stdIn.nextInt();
		
		System.out.println("左上直角の三角形を表示します。");
		for(int i=n;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("右下直角の三角形を表示します。");
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(j<=(n-i)){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
			
		System.out.println("右上直角の三角形を表示します。");
		
		for(int i=1;i<=n;i++){
			for(int j=n;j>=1;j--){
				if(j>(n-i+1)){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
	}
}