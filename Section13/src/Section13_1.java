import java.util.Scanner;
public class Section13_1 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.print("図形は何個：");
		Shape[] shapes=new Shape[stdIn.nextInt()];
		String a="番目の図形の種類（1・・・点／2・・・水平方向／3・・・垂直直線／4・・・長方形）：";
		for(int i=0;i<shapes.length;i++) {
			System.out.print(i+1+(String)a);
			int x=stdIn.nextInt();
			switch(x) {
			case 1:
				shapes[i]=new Point();
				break;
			case 2:
				System.out.print("長さ：");
				shapes[i]=new HorzLine(stdIn.nextInt());
				break;
			case 3:
				System.out.print("長さ：");
				shapes[i]=new VertLine(stdIn.nextInt());
				break;
			case 4:
				System.out.print("幅：");
				int w=stdIn.nextInt();
				System.out.print("高さ：");
				shapes[i]=new Rectangle(w,stdIn.nextInt());
			}
		}
		for(Shape shape:shapes) {
			shape.print();
		}
	}
}

abstract class Shape {
	public abstract String toString();
	public abstract void draw();
	public void print() {
		System.out.println(toString());
		draw();
	}
}
class Point extends Shape {
	public Point() {}
	public String toString() {
		return "Point"; 
	}
	public void draw() {
		System.out.println('+'); 
	}
}
class Rectangle extends Shape {
	private int width;
	private int height;
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public String toString() {
		return "Rectangle(width:" + width + ", height:" + height + ")"; 
	}
	public void draw() {
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++)
				System.out.print('*'); 
			System.out.println(); 
		}
	}
}
abstract class AbstLine extends Shape {
	private int length;
	public AbstLine(int length) {
		setLength(length);
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String toString() {
		return "AbstLine(length:" + length + ")"; 
	}
}
class HorzLine extends AbstLine {
	public HorzLine(int length) { super(length); }
	public String toString() {
		return "HorzLine(length:" + getLength() + ")"; 
	}
	public void draw() {
		for (int i = 1; i <= getLength() ; i++)
			System.out.print('-'); 
		System.out.println(); 
	}
}
class VertLine extends AbstLine {
	public VertLine(int length) { super(length); }
	public String toString() {
		return "VertLine(length:" + getLength()  + ")"; 
	}
	public void draw() {
		for (int i = 1; i <= getLength() ; i++)
			System.out.println('|'); 
	}
}

