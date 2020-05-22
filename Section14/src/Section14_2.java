
public class Section14_2 {

	public static void main(String[] args) {
		RobotPet a=new RobotPet("犬","飼い主");
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
		System.out.print("スキンを");
		switch(skin) {
		case BLACK: System.out.print("黒");  break;
		case RED:   System.out.print("赤");  break;
		case GREEN: System.out.print("緑");  break;
		default:    System.out.print("無地"); break;
		}
		System.out.println("に変更しました");
	}
}

class Pet {
	private String name;				// ペットの名前
	private String masterName;		// 飼い主の名前

	// コンストラクタ
	public Pet(String name, String masterName) {
		this.name = name;						// ペットの名前
		this.masterName = masterName;		// 飼い主の名前
	}

	// ペットの名前を調べる
	public String getName() { return name; }

	// 飼い主の名前を調べる
	public String getMasterName() { return masterName; }

	// 自己紹介
	public void introduce() {
		System.out.println("■僕の名前は" + name + "です！"); 
		System.out.println("■ご主人様は" + masterName + "です！");
	}
}

class RobotPet extends Pet {
	// コンストラクタ
	public RobotPet(String name, String masterName) {
		super(name, masterName);		// スーパークラスのコンストラクタ
	}

	// 自己紹介
	public void introduce() {
		System.out.println("◇私はロボット。名前は" + getName() + "。"); 
		System.out.println("◇ご主人様は" + getMasterName() + "。");
	}

	// 家事をする
	public void work(int sw) {
		switch (sw) {
		 case 0: System.out.println("掃除します。"); break;
		 case 1: System.out.println("洗濯します。"); break;
		 case 2: System.out.println("炊事します。"); break;
		}
	}
	
}
