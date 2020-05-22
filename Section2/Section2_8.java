import java.util.Random;
import java.util.Scanner;

public class Section2_8 {
	public static void main(String[] args) {
		Random rand=new Random();
		Scanner stdIn=new Scanner(System.in);
		
		int lucky=rand.nextInt(11)-5;
		
		System.out.print("整数値：");
		System.out.println("その値の±5をの乱数を生成しました。\nそれは"+(stdIn.nextInt()+lucky)+"です。");
	}
}