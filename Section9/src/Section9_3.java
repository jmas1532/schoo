
public class Section9_3 {

	public static void main(String[] args) {
		Account deta=new Account("データ","1234",100000,new Day(2020,12,1));
		System.out.println("口座開設日："+deta.getDay().toString());
	}

}

class Account {
	private String name;	
	private String no;		
	private long balance;
	private Day day;

	Account(String n, String num, long z,Day day) {
		name = n;					
		no = num;					
		balance = z;
		this.day=new Day(day);
	}

	String getName() {
		return name;
	}

	String getNo() {
		return no;
	}

	long getBalance() {
		return balance;
	}
	
	Day getDay() {
		return new Day(day);
	}

	void deposit(long k) {
		balance += k;
	}

	void withdraw(long k) {
		balance -= k;
	}
}

