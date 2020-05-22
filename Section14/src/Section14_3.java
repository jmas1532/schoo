
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
		System.out.println("¡‚c‚u‚cÄ¶ŠJnI");
	}

	public void stop() {											
		System.out.println("¡‚c‚u‚cÄ¶I—¹I"); 
	}

	public void slow() {										
		System.out.println("¡‚c‚u‚cƒXƒ[Ä¶ŠJnI"); 
	}
}
