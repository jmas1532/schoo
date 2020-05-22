import java.util.Scanner;
class Section7_23 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.print("配列aの要素数：");
		int n=stdIn.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			System.out.print("a["+i+"]：");
			a[i]=stdIn.nextInt();
		}
		System.out.print("探す値：");
		int x=stdIn.nextInt();
		int[] c=arraySrchIdx(a,x);
		System.out.println("探索しました");
		if(c.length==0){
			System.out.println("一致する値がありませんでした");
		}else{
			for(int j=0;j<c.length;j++){
				System.out.println("c["+j+"]="+c[j]);
			}
		}
	}
	static int[] arraySrchIdx(int[] a,int x){
		int count=0;
		for(int i=0;i<a.length;i++){
			if(a[i]==x){
				count++;
			}
		}
		int[] b=new int[count];
		for(int j=a.length-1;j>=0;j--){
			if(a[j]==x){
				b[count-1]=j;
				count--;
			}
		}
		return b;
	}
}
