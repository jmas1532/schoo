import java.util.Scanner;

public class Section15_3 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("������s1:"); String s1=stdIn.next();
		System.out.print("������s2�F"); String s2=stdIn.next();
		
		int idx=s1.indexOf(s2);
		int b=s2.length();
		if(idx==-1) {
			System.out.println("s1����s2�͊܂܂�܂���");
		}else {
			System.out.printf("s1:%"+s1.length()+"s\n",s1);
			System.out.printf("s2:%"+idx+"s%"+s2.length()+"s\n"," ",s2);
		}
	}

}