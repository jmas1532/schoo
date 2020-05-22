import java.util.Scanner;

class Section7_1 {

	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("値：");
		System.out.println("signOf値："+signOf(stdIn.nextInt()));
	}
	
	static int signOf(int a){
		if(a<0){
			return -1;
		}else if(a>0){
			return 1;
		}else{
			return 0;
		}
	}
}