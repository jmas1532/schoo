import java.util.Scanner;

public class Section3_6 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);

		System.out.print("整数値：　");
		int a=stdIn.nextInt();

	
		if(a<=0){
			System.out.println("正でない値が入力されました。");
		}else{
			if(a%10==0){
				System.out.println("その値は10の倍数です。");
			}else{
			System.out.println("その値は10の倍数ではありません");
			}
		}
	}
}