import java.util.Scanner;
class Section7_12 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.print("�����l�F");
		int x=stdIn.nextInt();
		System.out.print("��]���F");
		int n=stdIn.nextInt();
		System.out.println("�E��"+n+"�r�b�g��]�F"+rRotate(x,n));
		System.out.println("����"+n+"�r�b�g��]�F"+lRotate(x,n));
		
	}
	
	static int rRotate(int x,int n){
		return (x>>>n)|(x<<(32-n));
	}
	
	static int lRotate(int x,int n){
		return (x<<n)|(x>>>(32-n));
	}
	
}
