
public class Section10_2 {

	public static void main(String[] args) {
		ExId a = new ExId();		
		ExId b = new ExId();
		ExId.chNumber(4); //���ʔԍ������w��
		ExId c = new ExId();
		ExId d = new ExId();
		
		System.out.println("a�̎��ʔԍ��F" + a.getId());
		System.out.println("b�̎��ʔԍ��F" + b.getId());
		System.out.println("c�̎��ʔԍ��F" + c.getId());
		System.out.println("b�̎��ʔԍ��F" + d.getId());

	}
}

class ExId {
	static int counter = 0;
	static int number=1;
	
	private int id;
	public ExId() {
		counter +=number;
		id = counter;
	}

	public int getId() {
		return id;
	}

	//�ȉ��ǉ�
	public static void chNumber(int n) {
		number=n;
	}
	
}
