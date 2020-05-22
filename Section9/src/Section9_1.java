class Section9_1 {
	public static void main(String[] args) {
		Human[] Humans=new Human[3];
		Humans[0]=new Human("なかの",170,50);
		Humans[1]=new Human("かずま",171,51);
		Humans[2]=new Human();
		
		Humans[2].setName("ぽち");
		Humans[2].setHeight(180);
		Humans[2].setWeight(60);
		
		for(int i=0;i<Humans.length;i++) {
			System.out.println("名前："+Humans[i].getName());
			System.out.println("身長："+Humans[i].getHeight());
			System.out.println("体重："+Humans[i].getWeight());
		}
		
	}
}

class Human{
	private String name;
	private double height;
	private double weight;
	
	Human(){}
	
	Human(String name,double height,double weight){
		this.name=name;
		this.height=height;
		this.weight=weight;
	}
	
	String getName() {return name;}
	double getHeight() {return height;}
	double getWeight() {return weight;}
	
	void setName(String name) {this.name=name;}
	void setHeight(int height) {this.height=height;}
	void setWeight(int weight) {this.weight=weight;}
	
}