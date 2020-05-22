
public class Section12_2 {

	public static void main(String[] args) {
		// �ȉ��e�X�g
		Account a=new Account("a","123",10000);
		TimeAccount b=new TimeAccount("b","234",8000,3000);
		System.out.println(compBalance(a,b));

	}
	//�ȉ����\�b�h�ǉ�
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

	private static int counter = 0;		// ���Ԃ܂ł̎��ʔԍ���^������

	private String name;			// �������`
	private String no;			// �����ԍ�
	long balance;		// �a���c��
	private int id;				// ���ʔԍ�

	//-- �R���X�g���N�^ --//
	public Account(String n, String num, long z) {
		name = n;					// �������`
		no = num;					// �����ԍ�
		balance = z;				// �a���c��
		id = ++counter;			// ���ʔԍ�
	}

	//--- �������`�𒲂ׂ� ---//
	public String getName() {
		return name;
	}

	//--- �����ԍ��𒲂ׂ� ---//
	public String getNo() {
		return no;
	}

	//--- �a���c���𒲂ׂ� ---//
	public long getBalance() {
		return balance;
	}

	//--- ���ʔԍ����擾 ---//
	public int getId() {
		return id;
	}

	//--- k�~�a���� ---//
	public void deposit(long k) {
		balance += k;
	}

	//--- k�~���낷 ---//
	public void withdraw(long k) {
		balance -= k;
	}
}

class TimeAccount extends Account {
	private long timeBalance;				// �a���c���i����a���j

	// �R���X�g���N�^
	TimeAccount(String name, String no, long balance, long timeBalance) {
		super(name, no, balance);			// �N���XAccount�̃R���X�g���N�^�̌ďo��
		this.timeBalance = timeBalance;	// �a���c���i����a���j
	}

	// ����a���c���𒲂ׂ�
	long getTimeBalance() {
		return timeBalance;
	}

	// ����a������񂵂đS�z�𕁒ʗa���Ɉڂ�
	void cancel(long k) {
		deposit(timeBalance);
		timeBalance = 0;
	}
	
	
	
}
