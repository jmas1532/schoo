
public class Section12_1 {

	public static void main(String[] args) {
		ExCar bits=new ExCar("ビッツ",100,100,100,50.0);
		bits.move(2,2);
		bits.move(3,3);
		System.out.println(bits.getDistance());

	}

}

class ExCar extends Car{
	private double dis;
	public ExCar(String name, int width, int height, int length, double fuel) {
		super(name,width,height,length,fuel);
		dis=0;
	}
	public boolean move(double dx, double dy) {
		double dist = Math.sqrt(dx * dx + dy * dy);		// 移動距離

		if (dist > fuel)
			return false;				// 移動できない　… 燃料不足
		else {
			this.fuel -= dist;				// 移動距離の分だけ燃料が減る
			x += dx;
			y += dy;
			this.distance(dx,dy);
			return true;				// 移動完了
		}
	}
	public void distance(double dx,double dy) {
		this.dis+=Math.sqrt(dx * dx + dy * dy);
	}
	public double getDistance() {
		return dis;
	}
}

class Car {
	private String name;			// 名前
	private int width;			// 幅
	private int height;			// 高さ
	private int length;			// 長さ
	protected double x;				// 現在位置Ｘ座標
	protected double y;				// 現在位置Ｙ座標
	protected double fuel;			// 残り燃料

	//--- コンストラクタ ---//
	public Car(String name, int width, int height, int length, double fuel) {
		this.name = name;  		this.width = width;	this.height = height;
		this.length = length;	this.fuel = fuel;		x = y = 0.0;
	}

	public double getX() { return x; }			// 現在位置Ｘ座標を取得
	public double getY() { return y; }			// 現在位置Ｙ座標を取得
	public double getFuel() { return fuel; }	// 残り燃料を取得
	

	//--- スペック表示 ---//
	public void putSpec() {
		System.out.println("名前：" + name);
		System.out.println("車幅：" + width  + "mm");
		System.out.println("車高：" + height + "mm");
		System.out.println("車長：" + length + "mm");
	}

	//--- Ｘ方向にdx・Ｙ方向にdy移動 ---//
	public boolean move(double dx, double dy) {
		double dist = Math.sqrt(dx * dx + dy * dy);		// 移動距離

		if (dist > fuel)
			return false;				// 移動できない　… 燃料不足
		else {
			fuel -= dist;				// 移動距離の分だけ燃料が減る
			x += dx;
			y += dy;
			return true;				// 移動完了
		}
	}
}

