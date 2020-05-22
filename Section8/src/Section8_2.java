
 class Section8_2 {

	 public static void main(String[] args) {
		Car fit=new Car("フィット",100,50,80,50.0,"12-34","赤");
		System.out.println("車種："+fit.getName()+" ナンバー："+fit.getNumber()+" 色："+fit.getColor());
		

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
	private String number; //追加フィールド
	private String color; //追加フィールド

	 Car(String name, int width, int height, int length, double fuel,String number,String color) {
		this.name = name;  		this.width = width;	this.height = height;
		this.length = length;	this.fuel = fuel;		x = y = 0.0; 
		this.number=number;		this.color=color;
	}
	 
	 String getName() {return name;} //追加メソッド
	 int getWidth() {return width;}	//追加メソッド
	 int getHeight() {return height;} //追加メソッド
	 int getLength() {return length;} //追加メソッド
	 double getX() { return x; }	
	 double getY() { return y; }	
	 double getFuel() { return fuel; }
	 String getNumber() {return number;} //追加メソッド
	 String getColor() {return color;} //追加メソッド
	 

	 void putSpec() {
		System.out.println("名前：" + name);
		System.out.println("車幅：" + width  + "mm");
		System.out.println("車高：" + height + "mm");
		System.out.println("車長：" + length + "mm");
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