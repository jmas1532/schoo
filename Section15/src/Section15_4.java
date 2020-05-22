
public class Section15_4 {

	public static void main(String[] args) {
		printDouble(3.33,3,9);

	}
	
	public static void printDouble(double x,int p,int w) {
		String s=String.format("%%%d.%df",w,p);
		System.out.printf(s,x);
	}
}

