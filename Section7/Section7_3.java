import java.util.Scanner;

class Section7_3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] n=new int[3];
		System.out.print("a�̒l�F");
		n[0]=stdIn.nextInt();
		System.out.print("b�̒l�F");
		n[1]=stdIn.nextInt();
		System.out.print("c�̒l�F");
		n[2]=stdIn.nextInt();
		
		System.out.println("�����l��"+med(n[0],n[1],n[2]));
	}
	
	static int med(int a,int b,int c){
		int med=a;
		if(a>b&&a>c){
			if(b>c){
				med=b;
			}else{
				med=c;
			}}
		if(a<b&&a<c){
			if(b>c){
				med=c;
			}else{
				med=b;
			}}
		return med;
	}
}