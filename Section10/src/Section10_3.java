
public class Section10_3 {

	public static void main(String[] args) {
		//以下実験処理
		int[] a={2,4,1,0,5}; 
		System.out.println("2値最小値："+MinMax.min(2,4));
		System.out.println("3値最小値："+MinMax.min(2,4,1));
		System.out.println("2値最小値："+MinMax.min(a));
		System.out.println("2値最大値："+MinMax.max(2,4));
		System.out.println("3値最大値："+MinMax.max(2,4,1));
		System.out.println("2値最大値："+MinMax.max(a));
	}

}
final class MinMax {              //publicはつけない：1つのソースで2つ以上宣言できない(メモ)
	//2値の最小値
	public static int min(int a,int b) {
		return b>a?a:b;
	}
	//3値の最小値
	public static int min(int a,int b,int c) {
		return min(a,min(b,c));
	}
	//配列の最小値
	public static int min(int[] a) {
		int min =a[0];
		for(int i=1;i<a.length;i++) {
			min=min(min,a[i]);
		}
		return min;
	}
	//2値の最大値
	public static int max(int a,int b) {
		return b<a?a:b;
	}
	//3値の最大値
	public static int max(int a,int b,int c) {
		return max(a,max(b,c));
	}
	//配列の最大値
	public static int max(int[] a) {
		int max =a[0];
		for(int i=1;i<a.length;i++) {
			max=max(max,a[i]);
		}
		return max;
	}
}