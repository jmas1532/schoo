
public class Section10_5 {

	public static void main(String[] args) {
		Account nakano =new Account("仲野","1234567",1000);
		Account kazuma =new Account("和真","2345678",2000);

	}  

}
class Account {

	private static int counter = 0;

	private String name;
	private String no;	
	private long balance;
	private int id;		
	
	{
		System.out.println("明解銀行での口座開設ありがとうございます。");
	}
	public Account(String n, String num, long z) {
		name = n;
		no = num;
		balance = z;
		id = ++counter;
	}

	public String getName() {
		return name;
	}

	public String getNo() {
		return no;
	}

	public long getBalance() {
		return balance;
	}

	public int getId() {
		return id;
	}

	public void deposit(long k) {
		balance += k;
	}

	public void withdraw(long k) {
		balance -= k;
	}
}
