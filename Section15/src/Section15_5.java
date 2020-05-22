import java.util.Random;
import java.util.Scanner;

public class Section15_5 {
	public static void main(String[] args) {
		Person2 me=new Person2();
		Machine2 ai1=new Machine2();
		Machine2 ai2=new Machine2();
		me.hand();
		ai1.hand();
		ai2.hand();
		ai1.handAns();
		ai2.handAns();
		Player2.judge(me,ai1,ai2);
	}
}

abstract class Player2{
	protected int handId;
	public abstract void hand();
	public static void judge(Person2 h,Machine2 m,Machine2 n) {
		switch((h.handId+m.handId+n.handId)%3) {
		case 0: System.out.println("������"); break;
		case 1: System.out.println(m.handId==n.handId?"����":"����"); break;
		case 2: System.out.println(m.handId==n.handId?"����":"����"); break;
		}
	}
}

class Person2 extends Player2{
	Scanner stdIn=new Scanner(System.in);
	public void hand() {
		System.out.print("0�E�E�E�O�[�^1�E�E�E�`���L�^2�E�E�E�p�[�F");
		handId=stdIn.nextInt();
	}
}
class Machine2 extends Player2{
	Random r=new Random();
	public void hand() {
		handId=r.nextInt(3);
	}
	public void handAns() {
		switch(handId) {
		case 0: System.out.println("����F�O�["); break;
		case 1: System.out.println("����F�`���L"); break;
		case 2: System.out.println("����F�p�["); break;
		}
	}
}