import java.util.Scanner;

public class Section4_3 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);

		System.out.print("整数A：　");
		int	a=stdIn.nextInt();
		
		System.out.print("整数B：　");
		int	b=stdIn.nextInt();
		int min=a;
		int max=b;
		if(a>b){
			min=b;
			max=a;
		}else if(a==b){
			max=b+1;
		}
		int n=0;
		do{
			System.out.print((min+n)+" ");
			n++;
		}while(n!=(max-min));
		if(a!=b){
			System.out.println(max);
		}

	}
}