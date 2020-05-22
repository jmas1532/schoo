
import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;

public class Section10_4 {

	public static void main(String[] args) {
		Day d=new Day(2020,3,29);
		Day e=new Day(2020,3,1);
		Day f=new Day(2020,3,1);
		Day g=new Day(2020,5,1);
		System.out.println("d�F"+d.getYear()+"-"+d.getMonth()+"-"+d.getDay());
		System.out.println("�o�ߓ����F"+d.progDate());
		System.out.println("�c�����F"+d.remDate());
		d.relation(2019,1,31); //�O��֌W����C���X�^���X���\�b�h�Ăяo��
		int day1=20190225;
		int day2=20190224;
		Day.relatEx(day1,day2); //�O��֌W����N���X���\�b�h�Ăяo��
		d.back(); //1����ɂ��炷�C���X�^���X���\�b�h
		System.out.println("d��1����F"+d.getYear()+"-"+d.getMonth()+"-"+d.getDay());
		System.out.println("d�̂����1����F"+d.backRe()); //1����̕ԋp�l�擾
		System.out.println("e�F"+e.getYear()+"-"+e.getMonth()+"-"+e.getDay());
		e.front(); //1���O�ɂ��炷�C���X�^���X���\�b�h
		System.out.println("e��1���O�F"+e.getYear()+"-"+e.getMonth()+"-"+e.getDay());
		System.out.println("e�̂����1���O�F"+e.frontRe()); //1���O�̕ԋp�l�擾
		System.out.println("f�F"+f.getYear()+"-"+f.getMonth()+"-"+f.getDay());
		int n=31;
		f.backEx(n);//n���チ�\�b�h
		System.out.println("f��"+n+"����F"+f.getYear()+"-"+f.getMonth()+"-"+f.getDay());
		int m=15;
		System.out.println("f�̂����"+m+"����F"+f.backReEx(m)); 
		System.out.println("g�F"+g.getYear()+"-"+g.getMonth()+"-"+g.getDay());
		int s=1;
		g.frontEx(s);//n���O���\�b�h
		System.out.println("g��"+s+"����O�F"+g.getYear()+"-"+g.getMonth()+"-"+g.getDay());
		int t=15;
		System.out.println("g�̂����"+t+"���O�F"+g.frontReEx(t)); 
	}

}

class Day {
	GregorianCalendar today = new GregorianCalendar();
	private int year = today.get(YEAR);
	private int month = today.get(MONTH) + 1;
	private int date = today.get(DATE);

	//-- y�N�͉[�N���H --//
	public static boolean isLeap(int y) {
		return y % 4 == 0 && y % 100 != 0 || y % 400 == 0;
	}
	
	//-- �R���X�g���N�^ --//
	public Day()							  {}
	public Day(int year)                      { this.year = yCh(year); }
	public Day(int year, int month)           { this(year); this.month = mCh(month); }
	public Day(int year, int month, int date) { this(year, month); this.date = dCh(year,month,date); }
	public Day(Day d)                         { this(d.year, d.month, d.date); }

	//--- �N�E���E�����擾 ---//
	public int getYear()  { return year; }		// �N���擾
	public int getMonth() { return month; }	// �����擾
	public int getDay()   { return date; }		// �����擾

	//--- �N�E���E����ݒ� ---//
	public void setYear(int year)   { this.year  = year; }	// �N��ݒ�
	public void setMonth(int month) { this.month = month; }	// ����ݒ�
	public void setDate(int date)   { this.date  = date; }	// ����ݒ�

	public void set(int year, int month, int date) {			// �N����
		this.year  = year;			// �N	
		this.month = month;			// ��
		this.date  = date;			// ��
	}
	
	//-- �[�N���H --//
	public boolean isLeap() { return isLeap(year); }

	//--- �j�������߂� ---//
	public int dayOfWeek() {
		int y = year;					// 0 �c ���j��
		int m = month;					// 1 �c ���j��
		if (m == 1 || m == 2) {		//�@ �F
			y--;							// 5 �c ���j��
			m += 12;						// 6 �c �y�j��
		}
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
	}

	//--- ���td�Ɠ������� ---//
	public boolean equalTo(Day d) {
		return year == d.year && month == d.month && date == d.date;
	}

	//--- ������\����ԋp ---//
	public String toString() {
		String[] wd = {"��", "��", "��", "��", "��", "��", "�y"};
		return String.format("%04d�N%02d��%02d��(%s)", 
										year, month, date, wd[dayOfWeek()]);
	}
	
	//�y���K�ǉ����\�b�h�z
	//�s���l�C�����\�b�h
		public int yCh(int year) {
			return year<0?0:year;
		}
		public int mCh(int month) {
			if(month<1) {
				return 1;
			}else if(month>12) {
				return 12;
			}
			return month;
		}
		public int dCh(int year,int month,int date) {
			boolean isLeap=isLeap(year);
			month=mCh(month);
			if(month==2) {
				if(isLeap) {
					return date>29?29:date;
				}else {
					return date>28?28:date;
				}
			}else if(month==4||month==6||month==9||month==11) {
				return date>30?30:date;
			}else {
				return date>31?31:date;
			}
		}
		//�o�ߓ������\�b�h
		public static int days(int month) {
			switch(month) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					return 31;
				case 2:
					return 28;
				default:
					return 30;
			}
		}
		public static int progDate(int year,int month,int date) {
			int pDate=0;
			if(isLeap(year)&&month>2) {
				for(int i=1;i<month;i++) {
					pDate+=days(i);
				}
				return pDate+date+1;
			}else {
				for(int j=1;j<month;j++) {
					pDate+=days(j);
				}
				return pDate+date;
			}
		}
		public int progDate() {return progDate(year,month,date);}
		//�N���c��������\�b�h
		public static int remDate(int year,int month,int date) {
			int rDate=365-progDate(year,month,date);
			return isLeap(year)==true?rDate+1:rDate;
		}
		public int remDate() {return remDate(year,month,date);}
		//�O��֌W����C���X�^���X���\�b�h
		public void relation(int year,int month,int date) {
			if(this.year>year) {
				System.out.println("��̓��t�ł��B");
			}else if(this.year<year){
				System.out.println("�O�̓��t�ł��B");
			}else {
				if(this.month>month) {
					System.out.println("��̓��t�ł��B");
				}else if(this.month<month){
					System.out.println("�O�̓��t�ł��B");
				}else {
					if(this.date>date) {
						System.out.println("��̓��t�ł��B");
					}else if(this.date<date){
						System.out.println("�O�̓��t�ł��B");
					}else {
						System.out.println("�������t�ł��B");
					}
				}
			}
		}
		//�O��֌W����N���X���\�b�h
		public static int chY(int day) {
			return (day-day%10000)/10000;
		}
		public static int chM(int day) {
			return ((day-day%100)/100)%100;
		}
		public static int chD(int day) {
			return day%100;
		}
		public static void relatEx(int day1,int day2) {
			if(chY(day1)>chY(day2)) {
				System.out.println("day2����ł�");
			}else if(chY(day1)<chY(day2)){
				System.out.println("day1����ł�");
			}else {
				if(chM(day1)>chM(day2)) {
					System.out.println("day2����ł�\"");
				}else if(chM(day1)<chM(day2)){
					System.out.println("day1����ł�");
				}else {
					if(chD(day1)>chD(day2)) {
						System.out.println("day2����ł�\"");
					}else if(chD(day1)<chD(day2)){
						System.out.println("day1����ł�");
					}else {
						System.out.println("�������t�ł��B");
					}
				}
			}
		}
		//���t��1�����ɂ��炷���\�b�h
		public void back() {
			if(month==12&&date==31) {
				this.year=year+1;
				this.month=1;
				this.date=1;
			}else {
				if(month==2) {
					if(isLeap(year)) {
						this.month=(date==29)?month+1:month;
						this.date=(date==29)?1:date+1;
					}else {
						this.month=(date==28)?month+1:month;
						this.date=(date==28)?1:date+1;
					}
				}else {
					int da=date;
					this.date=(date==days(month))?1:date+1;
					this.month=(da==days(month))?month+1:month;
				}
			}
		}
		//���̓��̓��t��ԋp���郁�\�b�h
		public String backRe() {
			this.back();
			return year+"-"+month+"-"+date;
		}
		//1���O�ɂ��炷���\�b�h
		public void front() {
			if(month==1&&date==1) {
				this.year=year-1;
				this.month=12;
				this.date=31;
			}else {
				if(month==3&&date==1) {
					if(isLeap(year)) {
						this.month=2;
						this.date=29;
					}else {
						this.month=2;
						this.date=28;
					}
				}else if(date==1){
					this.month=month-1;
					this.date=days(month);
				}else {
					this.date=date-1;
				}
			}
		}
		//�O�̓��̓��t��ԋp���郁�\�b�h
		public String frontRe() {
			this.front();
			return year+"-"+month+"-"+date;
		}
		//n���チ�\�b�h�E�ԋp���\�b�h
		public void backEx(int n) {
			while(n-->0) {
				this.back();
			}
		}
		public String backReEx(int n) {
			this.backEx(n);
			return year+"-"+month+"-"+date;
		}
		//n���O���\�b�h�E�ԋp���\�b�h
		public void frontEx(int n) {
			while(n-->0) {
				this.front();
			}
		}
		public String frontReEx(int n) {
			this.frontEx(n);
			return year+"-"+month+"-"+date;
		}
	
}
