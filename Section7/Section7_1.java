import java.util.Scanner;

class Section7_1 {

	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("�l�F");
		System.out.println("signOf�l�F"+signOf(stdIn.nextInt()));
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