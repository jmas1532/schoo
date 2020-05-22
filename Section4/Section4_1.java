import java.util.Scanner;

public class Section4_1 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int retry;
		do{
			System.out.print("整数値：　");
			int x=stdIn.nextInt();
			
			if(x>0){
				System.out.println("その値は正です。");
			}else if(x<0){
				System.out.println("その値は負です。");
			}else{
				System.out.println("その値は0です。");
			}
		
			System.out.print("もう一度？ 1…Yes/0…No：");
			retry=stdIn.nextInt();
		}while(retry==1);
	}
}