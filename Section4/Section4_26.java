import java.util.Scanner;

public class Section4_26 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		
		//List4-17
		System.out.println("®”‚ğ‰ÁZ‚µ‚Ü‚·");
		System.out.print("‰½ŒÂ‰ÁZ‚µ‚Ü‚·‚©F");
		int n=stdIn.nextInt();
		
		int sum=0;
		int aveCount=0;
		for(int i=0;i<n;i++){
			System.out.print("®”F");
			int t =stdIn.nextInt();
			if(t<0){
				System.out.println("•‰‚Ì˜a‚Í‰ÁZ‚µ‚Ü‚¹‚ñ");
				continue;
			}
			sum+=t;
			aveCount++;
		}
		int ave=sum/aveCount;
		System.out.println("‡Œv‚Í"+sum+"‚Å‚·B");
		System.out.println("•½‹Ï‚Í"+ave+"‚Å‚·B");
		
		
			
	}
}