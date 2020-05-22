import java.util.Scanner;
class Section7_12 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.print("整数値：");
		int x=stdIn.nextInt();
		System.out.print("回転数：");
		int n=stdIn.nextInt();
		System.out.println("右に"+n+"ビット回転："+rRotate(x,n));
		System.out.println("左に"+n+"ビット回転："+lRotate(x,n));
		
	}
	
	static int rRotate(int x,int n){
		return (x>>>n)|(x<<(32-n));
	}
	
	static int lRotate(int x,int n){
		return (x<<n)|(x>>>(32-n));
	}
	
}
