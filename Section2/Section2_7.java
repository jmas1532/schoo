import java.util.Random;

public class Section2_7 {
	public static void main(String[] args) {
		Random rand=new Random();
		
		int lucky1=rand.nextInt(9);
		System.out.println(lucky1+1);
		
		int lucky2=rand.nextInt(9);
		System.out.println(-(lucky2+1));
		
		int lucky3=rand.nextInt(90);
		System.out.println(lucky3+10);
	}
}