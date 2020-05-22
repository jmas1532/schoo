import java.util.Scanner;

public class Section3_18{
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("Œ‚ÍF");
		int x=stdIn.nextInt();
		
		switch(x){
		case 3:
		case 4:
		case 5:
			System.out.println("t");
		break;
		case 6:
		case 7:
		case 8:
			System.out.println("‰Ä");
		break;
		case 9:
		case 10:
		case 11:
			System.out.println("H");
		break;
		default:
			System.out.println("“~");
		break;
		}
	}
}