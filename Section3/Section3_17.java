import java.util.Random;

public class Section3_17 {
	public static void main(String[] args) {
		Random rand=new Random();
		
		int lucky=rand.nextInt(3);
		switch(lucky){
		case 0:
			System.out.println("�O�[");
		break;
		case 1:
			System.out.println("�`���L");
		break;
		case 2:
			System.out.println("�p�[");
		break;
		}
	}
}