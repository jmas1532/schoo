import java.util.Scanner;

public class Section3_13 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);

		System.out.print("����A�F�@");
		int a=stdIn.nextInt();

		System.out.print("����B�F�@");
		int b=stdIn.nextInt();
		
		
		System.out.print("����C�F�@");
		int c=stdIn.nextInt();
		
		int min =a;
		int max=a;
		int bet;
		
		if(b<a){
			min=b;
		}else{
			max=b;
		}
		if(c<min){
			bet=min;
		}else{
			if(c<max){
				bet=c;
			}else{
				bet=max;
			}
		}
		System.out.println("�����l��"+bet);
	}
}