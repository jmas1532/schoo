import java.util.Random;
import java.util.Scanner;

class Section6_14 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		String[] months = {
			"January", "February", "March", "April", "May", "June", "July",
			"August", "September", "October", "November", "December"
		};
		int a=rand.nextInt(12);;
		int b;
		int d;
		do{
			do{
				b=rand.nextInt(12);
				if(a!=b) {
					a=b;
					break;
				}
			}while(true);
			do{
				System.out.print(a+1+"���F");
				String c=stdIn.next();
				if(c.equals(months[a])) break;
				System.out.println("�Ⴂ�܂�");
			}while(true);
			System.out.print("�����ł��B������x�H1�cYes/0�cNo�F");
			d=stdIn.nextInt();
		}while(d==1);
		}

	
}