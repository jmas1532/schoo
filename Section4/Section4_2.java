import java.util.Random;
import java.util.Scanner;

public class Section4_2 {
	public static void main(String[] args) {
		Random rand=new Random();
		Scanner stdIn=new Scanner(System.in);
		
		int lucky=rand.nextInt(90)+10;
		
		System.out.println("数当てゲーム開始");
		System.out.println("10～99の数を当ててください");
		
		int x;

		do{
			System.out.print("いくつかな：　");
			x=stdIn.nextInt();
			
			if(x>lucky){
				System.out.println("もっと小さな数だよ。");
			}else if(x<lucky){
				System.out.println("もっと大きな数だよ。");
			}
		}while(x!=lucky);
		System.out.println("正解です");
	}
}