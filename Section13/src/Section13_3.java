import java.util.*;

public class Section13_3 {
	public static void main(String[] args) {
		Person me=new Person();
		Machine ai=new Machine();
		me.hand();
		ai.hand();
		ai.handAns();
		Player.judge(me,ai);
	}
}

abstract class Player{
	protected int handId;
	public abstract void hand();
	public static void judge(Person h,Machine m) {
		switch(h.handId*m.handId) {
		case 1:case 4:case 9: System.out.println("������"); break;
		case 2: System.out.println(h.handId==0?"����":"����"); break;
		case 3: System.out.println(h.handId==0?"����":"����"); break;
		case 6: System.out.println(h.handId==2?"����":"����"); break;
		}
	}
}

class Person extends Player{
	Scanner stdIn=new Scanner(System.in);
	public void hand() {
		System.out.print("1�E�E�E�O�[�^2�E�E�E�`���L�^3�E�E�E�p�[�F");
		handId=stdIn.nextInt();
	}
}
class Machine extends Player{
	Random r=new Random();
	public void hand() {
		handId=r.nextInt(3)+1;
	}
	public void handAns() {
		switch(handId) {
		case 1: System.out.println("����F�O�["); break;
		case 2: System.out.println("����F�`���L"); break;
		case 3: System.out.println("����F�p�["); break;
		}
	}
}