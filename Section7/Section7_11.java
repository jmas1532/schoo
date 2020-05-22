import java.util.Scanner;
class Section7_11 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.print("整数値：");
		int x=stdIn.nextInt();
		System.out.println("右シフト："+(x>>1));
		System.out.println("左シフト："+(x<<1));
		
	}
}
