
public class Section10_1 {

	public static void main(String[] args) {
		Id a = new Id();		
		Id b = new Id();	
		Id c = new Id();
		Id d = new Id();
		
		System.out.println("�ŏI���ʔԍ��F"+Id.getMaxId());
	}
}

class Id {
	static int counter = 0;	
	private int id;
	public Id() {
		id = ++counter;
	}

	public int getId() {
		return id;
	}
	// �ȉ��ǉ��N���X���\�b�h
	public static int getMaxId() {
		return counter;
	}
}