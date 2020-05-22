
import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;

public class Section10_4 {

	public static void main(String[] args) {
		Day d=new Day(2020,3,29);
		Day e=new Day(2020,3,1);
		Day f=new Day(2020,3,1);
		Day g=new Day(2020,5,1);
		System.out.println("d："+d.getYear()+"-"+d.getMonth()+"-"+d.getDay());
		System.out.println("経過日数："+d.progDate());
		System.out.println("残日数："+d.remDate());
		d.relation(2019,1,31); //前後関係判定インスタンスメソッド呼び出し
		int day1=20190225;
		int day2=20190224;
		Day.relatEx(day1,day2); //前後関係判定クラスメソッド呼び出し
		d.back(); //1日後にずらすインスタンスメソッド
		System.out.println("dの1日後："+d.getYear()+"-"+d.getMonth()+"-"+d.getDay());
		System.out.println("dのさらに1日後："+d.backRe()); //1日後の返却値取得
		System.out.println("e："+e.getYear()+"-"+e.getMonth()+"-"+e.getDay());
		e.front(); //1日前にずらすインスタンスメソッド
		System.out.println("eの1日前："+e.getYear()+"-"+e.getMonth()+"-"+e.getDay());
		System.out.println("eのさらに1日前："+e.frontRe()); //1日前の返却値取得
		System.out.println("f："+f.getYear()+"-"+f.getMonth()+"-"+f.getDay());
		int n=31;
		f.backEx(n);//n日後メソッド
		System.out.println("fの"+n+"日後："+f.getYear()+"-"+f.getMonth()+"-"+f.getDay());
		int m=15;
		System.out.println("fのさらに"+m+"日後："+f.backReEx(m)); 
		System.out.println("g："+g.getYear()+"-"+g.getMonth()+"-"+g.getDay());
		int s=1;
		g.frontEx(s);//n日前メソッド
		System.out.println("gの"+s+"日後前："+g.getYear()+"-"+g.getMonth()+"-"+g.getDay());
		int t=15;
		System.out.println("gのさらに"+t+"日前："+g.frontReEx(t)); 
	}

}

class Day {
	GregorianCalendar today = new GregorianCalendar();
	private int year = today.get(YEAR);
	private int month = today.get(MONTH) + 1;
	private int date = today.get(DATE);

	//-- y年は閏年か？ --//
	public static boolean isLeap(int y) {
		return y % 4 == 0 && y % 100 != 0 || y % 400 == 0;
	}
	
	//-- コンストラクタ --//
	public Day()							  {}
	public Day(int year)                      { this.year = yCh(year); }
	public Day(int year, int month)           { this(year); this.month = mCh(month); }
	public Day(int year, int month, int date) { this(year, month); this.date = dCh(year,month,date); }
	public Day(Day d)                         { this(d.year, d.month, d.date); }

	//--- 年・月・日を取得 ---//
	public int getYear()  { return year; }		// 年を取得
	public int getMonth() { return month; }	// 月を取得
	public int getDay()   { return date; }		// 日を取得

	//--- 年・月・日を設定 ---//
	public void setYear(int year)   { this.year  = year; }	// 年を設定
	public void setMonth(int month) { this.month = month; }	// 月を設定
	public void setDate(int date)   { this.date  = date; }	// 日を設定

	public void set(int year, int month, int date) {			// 年月日
		this.year  = year;			// 年	
		this.month = month;			// 月
		this.date  = date;			// 日
	}
	
	//-- 閏年か？ --//
	public boolean isLeap() { return isLeap(year); }

	//--- 曜日を求める ---//
	public int dayOfWeek() {
		int y = year;					// 0 … 日曜日
		int m = month;					// 1 … 月曜日
		if (m == 1 || m == 2) {		//　 ：
			y--;							// 5 … 金曜日
			m += 12;						// 6 … 土曜日
		}
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
	}

	//--- 日付dと等しいか ---//
	public boolean equalTo(Day d) {
		return year == d.year && month == d.month && date == d.date;
	}

	//--- 文字列表現を返却 ---//
	public String toString() {
		String[] wd = {"日", "月", "火", "水", "木", "金", "土"};
		return String.format("%04d年%02d月%02d日(%s)", 
										year, month, date, wd[dayOfWeek()]);
	}
	
	//【演習追加メソッド】
	//不正値修正メソッド
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
		//経過日数メソッド
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
		//年内残り日数メソッド
		public static int remDate(int year,int month,int date) {
			int rDate=365-progDate(year,month,date);
			return isLeap(year)==true?rDate+1:rDate;
		}
		public int remDate() {return remDate(year,month,date);}
		//前後関係判定インスタンスメソッド
		public void relation(int year,int month,int date) {
			if(this.year>year) {
				System.out.println("後の日付です。");
			}else if(this.year<year){
				System.out.println("前の日付です。");
			}else {
				if(this.month>month) {
					System.out.println("後の日付です。");
				}else if(this.month<month){
					System.out.println("前の日付です。");
				}else {
					if(this.date>date) {
						System.out.println("後の日付です。");
					}else if(this.date<date){
						System.out.println("前の日付です。");
					}else {
						System.out.println("同じ日付です。");
					}
				}
			}
		}
		//前後関係判定クラスメソッド
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
				System.out.println("day2が先です");
			}else if(chY(day1)<chY(day2)){
				System.out.println("day1が先です");
			}else {
				if(chM(day1)>chM(day2)) {
					System.out.println("day2が先です\"");
				}else if(chM(day1)<chM(day2)){
					System.out.println("day1が先です");
				}else {
					if(chD(day1)>chD(day2)) {
						System.out.println("day2が先です\"");
					}else if(chD(day1)<chD(day2)){
						System.out.println("day1が先です");
					}else {
						System.out.println("同じ日付です。");
					}
				}
			}
		}
		//日付を1日後ろにずらすメソッド
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
		//次の日の日付を返却するメソッド
		public String backRe() {
			this.back();
			return year+"-"+month+"-"+date;
		}
		//1日前にずらすメソッド
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
		//前の日の日付を返却するメソッド
		public String frontRe() {
			this.front();
			return year+"-"+month+"-"+date;
		}
		//n日後メソッド・返却メソッド
		public void backEx(int n) {
			while(n-->0) {
				this.back();
			}
		}
		public String backReEx(int n) {
			this.backEx(n);
			return year+"-"+month+"-"+date;
		}
		//n日前メソッド・返却メソッド
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
