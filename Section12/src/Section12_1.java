
public class Section12_1 {

	public static void main(String[] args) {
		ExCar bits=new ExCar("�r�b�c",100,100,100,50.0);
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
		double dist = Math.sqrt(dx * dx + dy * dy);		// �ړ�����

		if (dist > fuel)
			return false;				// �ړ��ł��Ȃ��@�c �R���s��
		else {
			this.fuel -= dist;				// �ړ������̕������R��������
			x += dx;
			y += dy;
			this.distance(dx,dy);
			return true;				// �ړ�����
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
	private String name;			// ���O
	private int width;			// ��
	private int height;			// ����
	private int length;			// ����
	protected double x;				// ���݈ʒu�w���W
	protected double y;				// ���݈ʒu�x���W
	protected double fuel;			// �c��R��

	//--- �R���X�g���N�^ ---//
	public Car(String name, int width, int height, int length, double fuel) {
		this.name = name;  		this.width = width;	this.height = height;
		this.length = length;	this.fuel = fuel;		x = y = 0.0;
	}

	public double getX() { return x; }			// ���݈ʒu�w���W���擾
	public double getY() { return y; }			// ���݈ʒu�x���W���擾
	public double getFuel() { return fuel; }	// �c��R�����擾
	

	//--- �X�y�b�N�\�� ---//
	public void putSpec() {
		System.out.println("���O�F" + name);
		System.out.println("�ԕ��F" + width  + "mm");
		System.out.println("�ԍ��F" + height + "mm");
		System.out.println("�Ԓ��F" + length + "mm");
	}

	//--- �w������dx�E�x������dy�ړ� ---//
	public boolean move(double dx, double dy) {
		double dist = Math.sqrt(dx * dx + dy * dy);		// �ړ�����

		if (dist > fuel)
			return false;				// �ړ��ł��Ȃ��@�c �R���s��
		else {
			fuel -= dist;				// �ړ������̕������R��������
			x += dx;
			y += dy;
			return true;				// �ړ�����
		}
	}
}

