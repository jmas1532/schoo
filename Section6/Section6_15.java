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
			"���j��","���j��","�Ηj��","���j��","�ؗj��","���j��","�y�j��"
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
				System.out.print(week[a]+"�F");
				String c=stdIn.next();
				if(c.equals(weeks[a])) break;
				System.out.println("�Ⴂ�܂�");
			}while(true);
			System.out.print("�����ł��B������x�H1�cYes/0�cNo�F");
			d=stdIn.nextInt();
		}while(d==1);
		}

	
}