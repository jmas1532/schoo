import java.util.Scanner;

class Section16_3 {

	//--- 配列の要素a[idx1]とa[idx2]を交換 ---//
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	//--- 配列aの要素の並びを反転（誤り）---//
	static void reverse(int[] a) {
		try {
			for (int i = 0; i < a.length / 2; i++)
				swap(a, i, a.length - i);
			if(a==null) throw new NullPointerException();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.exit(1);
		}catch(NullPointerException e) {
			System.out.println("配列xは空参照です。"+e);
			System.exit(1);
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("要素数：");
		int num = stdIn.nextInt();		// 要素数
		
		int[] x = new int[num];			// 要素数numの配列
		if(num==0) x=null;
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}

		reverse(x);						// 配列xの要素の並びを反転

		System.out.println("要素の並びを反転しました。");
		for (int i = 0; i < num; i++)
			System.out.println("x[" + i + "] = " + x[i]);
	}
}
