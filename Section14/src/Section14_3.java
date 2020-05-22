
public class Section14_3 {

	public static void main(String[] args) {
		ExPlayer dvd=new DVDPlayer();
		dvd.play();
		dvd.stop();
		dvd.slow();
	}

}

interface Player {
	void play();	
	void stop();
}

interface ExPlayer extends Player {
	void slow();			
}

class DVDPlayer implements ExPlayer {

	public void play() {										
		System.out.println("���c�u�c�Đ��J�n�I");
	}

	public void stop() {											
		System.out.println("���c�u�c�Đ��I���I"); 
	}

	public void slow() {										
		System.out.println("���c�u�c�X���[�Đ��J�n�I"); 
	}
}
