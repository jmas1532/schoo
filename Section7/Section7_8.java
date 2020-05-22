import java.util.Scanner;
import java.util.Random;
class Section7_8 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("aの値：");
		int a = stdIn.nextInt();
		System.out.print("bの値：");
		int b = stdIn.nextInt();
		System.out.println("ランダム値："+random(a,b));
	}
	
	static int random(int a,int b){
		Random rand=new Random();
		if(b>=a){
			return rand.nextInt(b-a+1)+a;
		}else{
			return a;
		}
	}
}
