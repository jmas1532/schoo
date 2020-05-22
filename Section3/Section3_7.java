import java.util.Scanner;

public class Section3_7 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);

		System.out.print("整数値：　");
		int a=stdIn.nextInt();

	
		if(a<=0){
			System.out.println("正でない値が入力されました。");
		}else{
			if(a%3==0){
				System.out.println("その値は3で割り切れます。");
			}else if(a%3==1){
				System.out.println("その値を3で割った余りは1です");
			}else{
				System.out.println("その値を3で割った余りは2です");
			}
		}
	}
}