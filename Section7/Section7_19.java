import java.util.Scanner;
class Section7_19 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.print("�v�f���F");
		int x=stdIn.nextInt();
		int[] a=new int[x];
		for(int i=0;i<x;i++){
			System.out.print("a["+i+"]�F");
			a[i]=stdIn.nextInt();
		}
		System.out.print("�폜���J�n����v�f�́F");
		int idx=stdIn.nextInt();
		System.out.print("���폜���܂����F");
		int n=stdIn.nextInt();
		aryRmvN(a,idx,n);
		if(n>1){
			System.out.println("a["+idx+"]����a["+(idx+n-1)+"]�܂ō폜���܂���");
		}else if(n==1){
			System.out.println("a["+idx+"]���폜���܂���");
		}
		for(int j=0;j<x;j++){
			System.out.println("a["+j+"]="+a[j]);
		}
	}
	
	static void aryRmvN(int[] a,int idx,int n){
		for(int i=idx;i<idx+n;i++){
			if(i+n>=a.length) break;
			a[i]=a[i+n];
		}
	}
	
}
