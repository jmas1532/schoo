import java.util.Scanner;

class Section7_2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] n=new int[3];
		System.out.print("aの値：");
		n[0]=stdIn.nextInt();
		System.out.print("bの値：");
		n[1]=stdIn.nextInt();
		System.out.print("cの値：");
		n[2]=stdIn.nextInt();
		
		System.out.println("最小値は"+min(n[0],n[1],n[2]));
	}
	
	static int min(int a,int b,int c){
		int min=a;
		if(b<a)
			min=b;
		if(c<b)
			min=c;
		return min;
	}
}