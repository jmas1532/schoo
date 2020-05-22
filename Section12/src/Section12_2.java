
public class Section12_2 {

	public static void main(String[] args) {
		// 以下テスト
		Account a=new Account("a","123",10000);
		TimeAccount b=new TimeAccount("b","234",8000,3000);
		System.out.println(compBalance(a,b));

	}
	//以下メソッド追加
	public static int compBalance(Account a,Account b) {
			
			if(a instanceof TimeAccount&&b instanceof TimeAccount) {
				long aSum=a.balance+((TimeAccount)a).getTimeBalance();
				long bSum=b.balance+((TimeAccount)b).getTimeBalance();
				if(aSum>bSum) {
					return 1;
				}else if(aSum<bSum) {
					return -1;
				}else {
					return 0;
				}
			}else {
				if(a.balance>b.balance) {
					return 1;
				}else if(a.balance<b.balance) {
					return -1;
				}else {
					return 0;
				}
			}
			
		}

}

class Account {

	private static int counter = 0;		// 何番までの識別番号を与えたか

	private String name;			// 口座名義
	private String no;			// 口座番号
	long balance;		// 預金残高
	private int id;				// 識別番号

	//-- コンストラクタ --//
	public Account(String n, String num, long z) {
		name = n;					// 口座名義
		no = num;					// 口座番号
		balance = z;				// 預金残高
		id = ++counter;			// 識別番号
	}

	//--- 口座名義を調べる ---//
	public String getName() {
		return name;
	}

	//--- 口座番号を調べる ---//
	public String getNo() {
		return no;
	}

	//--- 預金残高を調べる ---//
	public long getBalance() {
		return balance;
	}

	//--- 識別番号を取得 ---//
	public int getId() {
		return id;
	}

	//--- k円預ける ---//
	public void deposit(long k) {
		balance += k;
	}

	//--- k円おろす ---//
	public void withdraw(long k) {
		balance -= k;
	}
}

class TimeAccount extends Account {
	private long timeBalance;				// 預金残高（定期預金）

	// コンストラクタ
	TimeAccount(String name, String no, long balance, long timeBalance) {
		super(name, no, balance);			// クラスAccountのコンストラクタの呼出し
		this.timeBalance = timeBalance;	// 預金残高（定期預金）
	}

	// 定期預金残高を調べる
	long getTimeBalance() {
		return timeBalance;
	}

	// 定期預金を解約して全額を普通預金に移す
	void cancel(long k) {
		deposit(timeBalance);
		timeBalance = 0;
	}
	
	
	
}
