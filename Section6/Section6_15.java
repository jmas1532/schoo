import java.util.Random;
import java.util.Scanner;

class Section6_15 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		String[] weeks = {
			"Sunday","Monday","Tuesday","Wednesday","Thursday","Fryday","Saturday"
		};
		String[] week={
			"日曜日","月曜日","火曜日","水曜日","木曜日","金曜日","土曜日"
		};
		int a=rand.nextInt(7);;
		int b;
		int d;
		do{
			do{
				b=rand.nextInt(7);
				if(a!=b) {
					a=b;
					break;
				}
			}while(true);
			do{
				System.out.print(week[a]+"：");
				String c=stdIn.next();
				if(c.equals(weeks[a])) break;
				System.out.println("違います");
			}while(true);
			System.out.print("正解です。もう一度？1…Yes/0…No：");
			d=stdIn.nextInt();
		}while(d==1);
		}

	
}