import java.util.Scanner;

public class Section4_26 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		
		//List4-17
		System.out.println("整数を加算します");
		System.out.print("何個加算しますか：");
		int n=stdIn.nextInt();
		
		int sum=0;
		int aveCount=0;
		for(int i=0;i<n;i++){
			System.out.print("整数：");
			int t =stdIn.nextInt();
			if(t<0){
				System.out.println("負の和は加算しません");
				continue;
			}
			sum+=t;
			aveCount++;
		}
		int ave=sum/aveCount;
		System.out.println("合計は"+sum+"です。");
		System.out.println("平均は"+ave+"です。");
		
		
			
	}
}