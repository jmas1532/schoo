import java.util.Scanner;

public class Section4_26 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		
		//List4-17
		System.out.println("���������Z���܂�");
		System.out.print("�����Z���܂����F");
		int n=stdIn.nextInt();
		
		int sum=0;
		int aveCount=0;
		for(int i=0;i<n;i++){
			System.out.print("�����F");
			int t =stdIn.nextInt();
			if(t<0){
				System.out.println("���̘a�͉��Z���܂���");
				continue;
			}
			sum+=t;
			aveCount++;
		}
		int ave=sum/aveCount;
		System.out.println("���v��"+sum+"�ł��B");
		System.out.println("���ς�"+ave+"�ł��B");
		
		
			
	}
}