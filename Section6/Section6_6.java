import java.util.Scanner;

class Section6_6 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("人数は：");
		int n = stdIn.nextInt();
		int[] a=new int[n];
		int sum=0;
		double ave;
		int max=0;
		int min=0;
		for(int i=0;i<n;i++){
			System.out.print((i+1)+"人目の点数は：");
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
		System.out.println("合計点は"+sum+"です。");
		System.out.println("平均点は"+ave+"です。");
		System.out.println("最高点は"+max+"です。");
		System.out.println("最低点は"+min+"です。");
			
		
	}
}