
public class Section14_2 {

	public static void main(String[] args) {
		RobotPet a=new RobotPet("��","������");
		a.introduce();
		a.work(1);
		Skinnable b=new PortablePlayer();
		b.changeSkin(Skinnable.RED);

	}

}
interface Skinnable{
	int BLACK=0;
	int RED=1;
	int GREEN=2;
	void changeSkin(int skin);
}
class PortablePlayer implements Skinnable{
	public PortablePlayer() {}
	public void changeSkin(int skin) {
		System.out.print("�X�L����");
		switch(skin) {
		case BLACK: System.out.print("��");  break;
		case RED:   System.out.print("��");  break;
		case GREEN: System.out.print("��");  break;
		default:    System.out.print("���n"); break;
		}
		System.out.println("�ɕύX���܂���");
	}
}

class Pet {
	private String name;				// �y�b�g�̖��O
	private String masterName;		// ������̖��O

	// �R���X�g���N�^
	public Pet(String name, String masterName) {
		this.name = name;						// �y�b�g�̖��O
		this.masterName = masterName;		// ������̖��O
	}

	// �y�b�g�̖��O�𒲂ׂ�
	public String getName() { return name; }

	// ������̖��O�𒲂ׂ�
	public String getMasterName() { return masterName; }

	// ���ȏЉ�
	public void introduce() {
		System.out.println("���l�̖��O��" + name + "�ł��I"); 
		System.out.println("������l�l��" + masterName + "�ł��I");
	}
}

class RobotPet extends Pet {
	// �R���X�g���N�^
	public RobotPet(String name, String masterName) {
		super(name, masterName);		// �X�[�p�[�N���X�̃R���X�g���N�^
	}

	// ���ȏЉ�
	public void introduce() {
		System.out.println("�����̓��{�b�g�B���O��" + getName() + "�B"); 
		System.out.println("������l�l��" + getMasterName() + "�B");
	}

	// �Ǝ�������
	public void work(int sw) {
		switch (sw) {
		 case 0: System.out.println("�|�����܂��B"); break;
		 case 1: System.out.println("���󂵂܂��B"); break;
		 case 2: System.out.println("�������܂��B"); break;
		}
	}
	
}
