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
		case 1:case 4:case 9: System.out.println("あいこ"); break;
		case 2: System.out.println(h.handId==0?"勝ち":"負け"); break;
		case 3: System.out.println(h.handId==0?"負け":"勝ち"); break;
		case 6: System.out.println(h.handId==2?"勝ち":"負け"); break;
		}
	}
}

class Person extends Player{
	Scanner stdIn=new Scanner(System.in);
	public void hand() {
		System.out.print("1・・・グー／2・・・チョキ／3・・・パー：");
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
		case 1: System.out.println("相手：グー"); break;
		case 2: System.out.println("相手：チョキ"); break;
		case 3: System.out.println("相手：パー"); break;
		}
	}
}