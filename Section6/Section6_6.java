import java.util.Scanner;

class Section6_6 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("�l���́F");
		int n = stdIn.nextInt();
		int[] a=new int[n];
		int sum=0;
		double ave;
		int max=0;
		int min=0;
		for(int i=0;i<n;i++){
			System.out.print((i+1)+"�l�ڂ̓_���́F");
			a[i]=stdIn.nextInt();
			sum+=a[i];
			min=a[0];
				if(max<a[i]){
					max=a[i];
				}else if(min>a[i]){
					min=a[i];
				}
			}
			
		ave=sum/n;
		System.out.println("���v�_��"+sum+"�ł��B");
		System.out.println("���ϓ_��"+ave+"�ł��B");
		System.out.println("�ō��_��"+max+"�ł��B");
		System.out.println("�Œ�_��"+min+"�ł��B");
			
		
	}
}