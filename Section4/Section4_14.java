import java.util.Scanner;

public class Section4_14 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);

		System.out.println("1����n�܂ł̘a�����߂܂��B");
		int n;
		
		do{
			System.out.print("n�̒l�F");
			n=stdIn.nextInt();
		}while(n<=0);
		int sum=0;
		for(int i=1;i<=n;i++){
			System.out.print(i);
			if(i!=n){
				System.out.print("+");
			}
			sum+=i;
		}
		System.out.println("="+sum);
	}
}