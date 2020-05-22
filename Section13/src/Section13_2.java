
public class Section13_2 {
	public static void main(String[] args) {
		IsoTriangle[] t= {new RightUnder(4),new LeftOver(4),new RightOver(4),new LeftUnder(4)};
		for(IsoTriangle i:t) {
			i.print();
		}
	}
}

abstract class IsoTriangle{
	protected int length;
	IsoTriangle(int l){this.length=l;}
	public void symbol(boolean bool) {
		System.out.print(bool?"+ ":"  ");
	}
	public void draw(int a) {
		for(int i=0;i<length;i++) {
			for(int j=0;j<length;j++) {
				boolean b=false;
				switch(a) {
				case 1:
					b=i>=length-j-1; break;
				case 2:
					b=i<=length-j-1; break;
				case 3:
					b=j>=i; break;
				case 4:
					b=j<=i; break;
				}
				symbol(b);
			}
			System.out.println();
		}
	}
	public abstract String toString();
	public abstract void draw();
	public void print() {
		System.out.println(toString());
		draw();
	}
}

//�E��
class RightUnder extends IsoTriangle {
	RightUnder(int l){super(l);}
	public void draw() {
		super.draw(1);
	}
	public String toString() {
		return "RightUnder";
	}
}
//����
class LeftOver extends IsoTriangle {
	LeftOver(int l){super(l);}
	public void draw() {
		super.draw(2);
	}
	public String toString() {
		return "LeftOver";
	}
}
//�E��
class RightOver extends IsoTriangle {
	RightOver(int l){super(l);}
	public void draw() {
		super.draw(3);
	}
	public String toString() {
		return "RightOver";
	}
}
//����
class LeftUnder extends IsoTriangle {
	LeftUnder(int l){super(l);}
	public void draw() {
		super.draw(4);
	}
	public String toString() {
		return "LeftUnder";
	}
}