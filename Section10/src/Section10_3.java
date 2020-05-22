
public class Section10_3 {

	public static void main(String[] args) {
		//�ȉ���������
		int[] a={2,4,1,0,5}; 
		System.out.println("2�l�ŏ��l�F"+MinMax.min(2,4));
		System.out.println("3�l�ŏ��l�F"+MinMax.min(2,4,1));
		System.out.println("2�l�ŏ��l�F"+MinMax.min(a));
		System.out.println("2�l�ő�l�F"+MinMax.max(2,4));
		System.out.println("3�l�ő�l�F"+MinMax.max(2,4,1));
		System.out.println("2�l�ő�l�F"+MinMax.max(a));
	}

}
final class MinMax {              //public�͂��Ȃ��F1�̃\�[�X��2�ȏ�錾�ł��Ȃ�(����)
	//2�l�̍ŏ��l
	public static int min(int a,int b) {
		return b>a?a:b;
	}
	//3�l�̍ŏ��l
	public static int min(int a,int b,int c) {
		return min(a,min(b,c));
	}
	//�z��̍ŏ��l
	public static int min(int[] a) {
		int min =a[0];
		for(int i=1;i<a.length;i++) {
			min=min(min,a[i]);
		}
		return min;
	}
	//2�l�̍ő�l
	public static int max(int a,int b) {
		return b<a?a:b;
	}
	//3�l�̍ő�l
	public static int max(int a,int b,int c) {
		return max(a,max(b,c));
	}
	//�z��̍ő�l
	public static int max(int[] a) {
		int max =a[0];
		for(int i=1;i<a.length;i++) {
			max=max(max,a[i]);
		}
		return max;
	}
}