
import java.util.Scanner;
class Section7_30 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.print("aの値：");
		int a=stdIn.nextInt();
		System.out.print("bの値：");
		int b=stdIn.nextInt();
		System.out.print("cの値：");
		int c=stdIn.nextInt();
		System.out.print("配列aの要素数：");
		int[] x=new int[stdIn.nextInt()];
		for(int i=0;i<x.length;i++){
			System.out.print("a["+i+"]=：");
			x[i]=stdIn.nextInt();
		}
		System.out.println("a,bの最小値："+min(a,b));
		System.out.println("a,b,cの最小値："+min(a,b,c));
		System.out.println("配列aの最小値："+min(x));
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