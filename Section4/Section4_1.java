import java.util.Scanner;

public class Section4_1 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int retry;
		do{
			System.out.print("�����l�F�@");
			int x=stdIn.nextInt();
			
			if(x>0){
				System.out.println("���̒l�͐��ł��B");
			}else if(x<0){
				System.out.println("���̒l�͕��ł��B");
			}else{
				System.out.println("���̒l��0�ł��B");
			}
		
			System.out.print("������x�H 1�cYes/0�cNo�F");
			retry=stdIn.nextInt();
		}while(retry==1);
	}
}