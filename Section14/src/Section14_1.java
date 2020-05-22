
public class Section14_1 {
	public static void main(String[] args) {
		Plane2D para=new Parallelogram(3,4);
		((Parallelogram)para).draw();
		System.out.println("�ʐ�"+para.getArea());

	}
}

interface Plane2D {
	int getArea();	
}

abstract class Shape {

	public abstract String toString();
	public abstract void draw();
	public void print() {
		System.out.println(toString());
		draw();
	}
}
//�_
class Point extends Shape {

	public Point() {
		// �����s��Ȃ�
	}
	public String toString() {
		return "Point"; 
	}
	public void draw() {
		System.out.println('+'); 
	}
}

//���s�l�ӌ`
class Parallelogram extends Shape implements Plane2D {
	private int width;		
	private int height;		

	public Parallelogram(int width, int height) {
		this.width = width;	this.height = height;
	}

	public String toString() {								
		return "Parallelogram(width:" + width + ", height:" + height + ")";
	}

	public void draw() {								
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= height - i; j++) System.out.print(' '); 
			for (int j = 1; j <= width; j++) System.out.print('#'); 
			System.out.println(); 
		}
	}

	public int getArea() { return width * height; }	
}


