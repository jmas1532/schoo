
class Section9_4 {
	public static void main(String[] args) {
		HumanN nakano=new HumanN("Ç»Ç©ÇÃ",170,50,new Day(1992,4,1));
		System.out.println("íaê∂ì˙ÅF"+nakano.getDay().toString());
	}
}

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