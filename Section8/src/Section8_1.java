
class Section8_1 {
	public static void main(String[] args) {
		Human nakano=new Human("�Ȃ���",170.0,55.0);
		System.out.println("���O�F"+nakano.getName());
		System.out.println("�g���F"+nakano.getHeight());
		System.out.println("�̏d�F"+nakano.getWeight());
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