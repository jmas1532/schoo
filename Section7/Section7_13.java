import java.util.Scanner;
class Section7_13 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.print("�����l�F");
		int x=stdIn.nextInt();
		System.out.print("pos�r�b�g�ځF");
		int pos=stdIn.nextInt();
		System.out.println("set���\�b�h�F"+set(x,pos));
		System.out.println("reset���\�b�h�F"+reset(x,pos));
		System.out.println("inverse���\�b�h�F"+inverse(x,pos));
		
	}
	
	static int set(int x,int pos){
		return x|(1<<pos);
	}
	
	static int reset(int x,int pos){
		return set(x,pos)^(1<<pos);
	}
	
	static int inverse(int x,int pos){
		if(((x>>pos)&1)==1){
			return reset(x,pos);
		}else{
			return set(x,pos);
		}
	}
}
