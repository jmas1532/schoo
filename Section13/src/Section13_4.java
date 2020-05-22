
public class Section13_4 {
	public static void main(String[] args) {
		HumanN nakano=new HumanN("なかの",170,50,new Day(1992,4,1));
		System.out.println("誕生日："+nakano.getDay().toString());
	}
}
/**
 * 人間クラス
 * @author dmdoj
 *
 */
class HumanN{
	private String name;
	private double height;
	private double weight;
	private Day day;
	
	HumanN(String name,double height,double weight,Day day){
		this.name=name;
		this.height=height;
		this.weight=weight;
		this.day=new Day(day);
	}
	
	String getName() {return name;}
	double getHeight() {return height;}
	double getWeight() {return weight;}
	Day getDay() {return new Day(day);}
	
	void setName(String name) {this.name=name;}
	void setHeight(int height) {this.height=height;}
	void setWeight(int weight) {this.weight=weight;}
	
}
class Day {
	private int	year	= 1;
	private int	month = 1;		
	private int	date 	= 1;	
	
	public Day()                              { }
	public Day(int year)                      { this.year = year; }
	public Day(int year, int month)           { this(year); this.month = month; }
	public Day(int year, int month, int date) { this(year, month); this.date = date; }
	public Day(Day d)                         { this(d.year, d.month, d.date); }

	public int getYear()  { return year; }		
	public int getMonth() { return month; }	
	public int getDate()  { return date; }

	public void setYear(int year)   { this.year  = year; }	
	public void setMonth(int month) { this.month = month; }	
	public void setDate(int date)   { this.date  = date; }	

	public void set(int year, int month, int date) {		
		this.year  = year;			
		this.month = month;		
		this.date  = date;	
	}

	public int dayOfWeek() {
		int y = year;				
		int m = month;				
		if (m == 1 || m == 2) {		
			y--;						
			m += 12;					
		}
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
	}

	public boolean equalTo(Day d) {
		return year == d.year && month == d.month && date == d.date;
	}

	public String toString() {
		String[] wd = {"日", "月", "火", "水", "木", "金", "土"};
		return String.format("%04d年%02d月%02d日(%s)", 
										year, month, date, wd[dayOfWeek()]);
	}
}
