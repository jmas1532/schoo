
import java.util.Scanner;
class Section7_31 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.println("1:int 2:long 3:float 4:double");
		System.out.print("�ԍ��őI��ł�������:");
		switch(stdIn.nextInt()){
			case 1:
				System.out.print("x�̒l�F");
				System.out.println("��Βl�F"+absolute(stdIn.nextInt()));
				break;
			case 2:
				System.out.print("x�̒l�F");
				System.out.println("��Βl�F"+absolute(stdIn.nextLong()));
				break;
			case 3:
				System.out.print("x�̒l�F");
				System.out.println("��Βl�F"+absolute(stdIn.nextFloat()));
				break;
			case 4:
				System.out.print("x�̒l�F");
				System.out.println("��Βl�F"+absolute(stdIn.nextDouble()));
				break;
		}
	}
	static int absolute(int x){
		return x>=0?x:-x;
	}
	static long absolute(long x){
		return x>=0?x:-x;
	}
	static float absolute(float x){
		return x>=0?x:-x;
	}
	static double absolute(double x){
		return x>=0?x:-x;
	}
		
	
}