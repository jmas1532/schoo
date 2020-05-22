import java.util.Random;

public class Section2_9 {
	public static void main(String[] args) {
		Random rand=new Random();
		
		double lucky1=rand.nextDouble();
		System.out.println(lucky1);
		
		double lucky2=rand.nextDouble();
		System.out.println(lucky2*10);
		
		double lucky3=rand.nextDouble();
		System.out.println(lucky3*2-1);
	}
}