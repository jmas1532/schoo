import java.util.Random;
import java.util.Scanner;

class Section4_27 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		int no = rand.nextInt(100);

		System.out.println("数当てゲーム開始!!");
		System.out.println("0～99の数を当ててください。");

		int x=0;
		int y=0;
		int a=6;//制限
		do {
			
			System.out.print("いくつかな：");
			x = stdIn.nextInt();
			y++;
			if(y==a) break;
			if (x > no)
				System.out.println("もっと小さな数だよ。");
			else if (x < no)
				System.out.println("もっと大きな数だよ。");
		} while (x != no);
		if(y==a){
			System.out.println("正解は"+no+"です。");
		}else{
			System.out.println("正解です。");
		}
	}
}
