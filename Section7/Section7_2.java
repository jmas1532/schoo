import java.util.Scanner;

class Section7_2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] n=new int[3];
		System.out.print("a�̒l�F");
		n[0]=stdIn.nextInt();
		System.out.print("b�̒l�F");
		n[1]=stdIn.nextInt();
		System.out.print("c�̒l�F");
		n[2]=stdIn.nextInt();
		
		System.out.println("�ŏ��l��"+min(n[0],n[1],n[2]));
	}
	
	static int min(int a,int b,int c){
		int min=a;
		if(b<a)
			min=b;
		if(c<b)
			min=c;
		return min;
	}
}