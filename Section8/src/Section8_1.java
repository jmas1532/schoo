
class Section8_1 {
	public static void main(String[] args) {
		Human nakano=new Human("なかの",170.0,55.0);
		System.out.println("名前："+nakano.getName());
		System.out.println("身長："+nakano.getHeight());
		System.out.println("体重："+nakano.getWeight());
	}
}

class Human{
	private String name;
	private double height;
	private double weight;
	
	Human(String name,double height,double weight){
		this.name=name;
		this.height=height;
		this.weight=weight;
	}
	
	String getName() {return name;}
	double getHeight() {return height;}
	double getWeight() {return weight;}
}