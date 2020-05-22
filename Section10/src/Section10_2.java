
public class Section10_2 {

	public static void main(String[] args) {
		ExId a = new ExId();		
		ExId b = new ExId();
		ExId.chNumber(4); //識別番号増加指示
		ExId c = new ExId();
		ExId d = new ExId();
		
		System.out.println("aの識別番号：" + a.getId());
		System.out.println("bの識別番号：" + b.getId());
		System.out.println("cの識別番号：" + c.getId());
		System.out.println("bの識別番号：" + d.getId());

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

	//以下追加
	public static void chNumber(int n) {
		number=n;
	}
	
}
