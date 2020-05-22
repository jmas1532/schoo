import java.util.Scanner;

public class Section4_25 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		
		//List4-17
		System.out.println("整数を加算します");
		System.out.print("何個加算しますか：");
		int n=stdIn.nextInt();
		
		int sum=0;
		int ave=0;
		for(int i=0;i<n;i++){
			System.out.print("整数（0で終了）：");
			int t =stdIn.nextInt();
			if(t==0) break;
			sum+=t;
			ave=sum/n;
			
		}
		System.out.println("合計は"+sum+"です。");
		System.out.println("平均は"+ave+"です。");
		
		//List4-18
		System.out.println("整数を加算します");
		System.out.print("何個加算しますか：");
		int m=stdIn.nextInt();
		
		int sum2=0;
		int ave2=0;
		for(int i=0;i<m;i++){
			System.out.print("整数：");
			int s =stdIn.nextInt();
			if(sum2+s>1000) {
				System.out.println("合計が1000を超えました");
				System.out.println("最後の数値は無視します");
				break;
			}
			sum2+=s;
			ave2=sum2/m;
		}
		System.out.println("合計は"+sum2+"です。");
		System.out.println("平均は"+ave+"です。");
		
			
	}
}