import java.util.Scanner;

public class Section3_8 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);

		System.out.print("点数：　");
		int a=stdIn.nextInt();

	
		if(a>=0&&a<60){
			System.out.println("不可");
		}else if(a>=60&&a<70){
			System.out.println("可");
		}else if(a>=70&&a<80){
			System.out.println("良");
		}else if(a>=80&&a<=100){
			System.out.println("優");
		}else{
			System.out.println("判定不可");
		}
	}
}