import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;

//コマンドプロンプトで実行
public class Section15_8 {

	public static void main(String[] args) {
		//コマンドライン引数受け取り
		switch(args.length) {
		case 0:
			DayEx d0=new DayEx(); cal(d0);
			break;
		case 1:
			DayEx[] d1=new DayEx[12];
			for(int i=0;i<=11;i++) {
				d1[i]=new DayEx(Integer.parseInt(args[0]),i+1);
			}
			for(DayEx d:d1) {
				cal(d);
			}
			break;
		case 2:
			int y=Integer.parseInt(args[0]); int m=Integer.parseInt(args[1]);
			DayEx d2=new DayEx(y,m);
			cal(d2);
			break;
		}
	}
	//カレンダー表示
	public static void cal(DayEx d) {
		System.out.println("--------"+d.getMonth()+"月--------");
		String[] w= {"日","月","火","水","木","金","土"};
		for(String x:w) {
			System.out.printf("%2s",x);
		}
		System.out.println();
		for(int j=0;j<d.dayOfWeek();j++) {
			System.out.printf("%3s","");
		}
		for(int i=1;i<=DayEx.days(d.getYear(),d.getMonth());i++) {
			System.out.printf("%3s",i);
			if((i+d.dayOfWeek())%7==0) {
				System.out.println();
			}
		}
		System.out.println();
	} 
}

class DayEx {
	GregorianCalendar today = new GregorianCalendar();
	private int year = today.get(YEAR);
	private int month = today.get(MONTH) + 1;
	private int date = 1;

	//-- y年は閏年か？ --//
	public static boolean isLeap(int y) {
		return y % 4 == 0 && y % 100 != 0 || y % 400 == 0;
	}
	
	//-- コンストラクタ --//
	public DayEx()							  {}
	public DayEx(int year)                      { this.year = year; }
	public DayEx(int year, int month)           { this(year); this.month =month; }

	//--- 年・月・日を取得 ---//
	public int getYear()  { return year; }		// 年を取得
	public int getMonth() { return month; }	// 月を取得
	public int getDay()   { return date; }		// 日を取得
	


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
	//経過日数メソッド
	public static int days(int year,int month) {
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
				return isLeap(year)?29:28;
			default:
				return 30;
		}
	}	
}
