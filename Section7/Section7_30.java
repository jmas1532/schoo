
import java.util.Scanner;
class Section7_30 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.print("a�̒l�F");
		int a=stdIn.nextInt();
		System.out.print("b�̒l�F");
		int b=stdIn.nextInt();
		System.out.print("c�̒l�F");
		int c=stdIn.nextInt();
		System.out.print("�z��a�̗v�f���F");
		int[] x=new int[stdIn.nextInt()];
		for(int i=0;i<x.length;i++){
			System.out.print("a["+i+"]=�F");
			x[i]=stdIn.nextInt();
		}
		System.out.println("a,b�̍ŏ��l�F"+min(a,b));
		System.out.println("a,b,c�̍ŏ��l�F"+min(a,b,c));
		System.out.println("�z��a�̍ŏ��l�F"+min(x));
	}
	static int min(int a,int b){
		return a>=b?b:a;
	}
	static int min(int a,int b,int c){
		return min(a,b)>=c?c:min(a,b);
	}
	static int min(int[] a){
		int min=a[0];
		for(int i=1;i<a.length;i++){
			min=min(min,a[i]);
		}
		return min;
	}
		
	
}