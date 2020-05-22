
 class Section8_2 {

	 public static void main(String[] args) {
		Car fit=new Car("�t�B�b�g",100,50,80,50.0,"12-34","��");
		System.out.println("�Ԏ�F"+fit.getName()+" �i���o�[�F"+fit.getNumber()+" �F�F"+fit.getColor());
		

	}

}

 class Car {
	private String name;	
	private int width;	
	private int height;		
	private int length;	
	private double x;
	private double y;
	private double fuel;
	private String number; //�ǉ��t�B�[���h
	private String color; //�ǉ��t�B�[���h

	 Car(String name, int width, int height, int length, double fuel,String number,String color) {
		this.name = name;  		this.width = width;	this.height = height;
		this.length = length;	this.fuel = fuel;		x = y = 0.0; 
		this.number=number;		this.color=color;
	}
	 
	 String getName() {return name;} //�ǉ����\�b�h
	 int getWidth() {return width;}	//�ǉ����\�b�h
	 int getHeight() {return height;} //�ǉ����\�b�h
	 int getLength() {return length;} //�ǉ����\�b�h
	 double getX() { return x; }	
	 double getY() { return y; }	
	 double getFuel() { return fuel; }
	 String getNumber() {return number;} //�ǉ����\�b�h
	 String getColor() {return color;} //�ǉ����\�b�h
	 

	 void putSpec() {
		System.out.println("���O�F" + name);
		System.out.println("�ԕ��F" + width  + "mm");
		System.out.println("�ԍ��F" + height + "mm");
		System.out.println("�Ԓ��F" + length + "mm");
	}

	 boolean move(double dx, double dy) {
		double dist = Math.sqrt(dx * dx + dy * dy);	
		if (dist > fuel)
			return false;	
		else {
			fuel -= dist;
			x += dx;
			y += dy;
			return true;
		}
	}
}