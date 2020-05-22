
public class Section9_5 {

	public static void main(String[] args) {
		Period p=new Period(new Day(2020,5,2),new Day(2021,5,1));
		System.out.println(p.days()?"1�N����":"1�N�ȏ�");

	}

}

class Period{
	private Day from;
	private Day to;
	
	Period(Day from,Day to){
		this.from=new Day(from);
		this.to=new Day(to);
	}
	//1�N��������Ԃ����\�b�h
	boolean days() {
		if(from.getYear()==to.getYear()) {
			return true;
		}else if(from.getYear()==to.getYear()-1) {
			if(from.getMonth()>to.getMonth()) {
				return true;
			}else if(from.getMonth()==to.getMonth()) {
				return from.getDate()>to.getDate()?true:false;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
}