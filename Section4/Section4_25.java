import java.util.Scanner;

public class Section4_25 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		
		//List4-17
		System.out.println("���������Z���܂�");
		System.out.print("�����Z���܂����F");
		int n=stdIn.nextInt();
		
		int sum=0;
		int ave=0;
		for(int i=0;i<n;i++){
			System.out.print("�����i0�ŏI���j�F");
			int t =stdIn.nextInt();
			if(t==0) break;
			sum+=t;
			ave=sum/n;
			
		}
		System.out.println("���v��"+sum+"�ł��B");
		System.out.println("���ς�"+ave+"�ł��B");
		
		//List4-18
		System.out.println("���������Z���܂�");
		System.out.print("�����Z���܂����F");
		int m=stdIn.nextInt();
		
		int sum2=0;
		int ave2=0;
		for(int i=0;i<m;i++){
			System.out.print("�����F");
			int s =stdIn.nextInt();
			if(sum2+s>1000) {
				System.out.println("���v��1000�𒴂��܂���");
				System.out.println("�Ō�̐��l�͖������܂�");
				break;
			}
			sum2+=s;
			ave2=sum2/m;
		}
		System.out.println("���v��"+sum2+"�ł��B");
		System.out.println("���ς�"+ave+"�ł��B");
		
			
	}
}