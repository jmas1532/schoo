import java.util.Scanner;
class Section7_17 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.print("�v�f���F");
		int n=stdIn.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			System.out.print("a["+i+"]�F");
			a[i]=stdIn.nextInt();
		}
		System.out.print("�T���l�F");
		int key=stdIn.nextInt();
		int ans=linearSearchR(a,key);
		if(ans==-1){
			System.out.println("���݂��܂���");
		}else{
			System.out.println("���̒l��a["+ans+"]�ɂ���܂��B");
		}
	}
	
	static int linearSearchR(int[] a,int key){
		for(int j=a.length-1;j>=0;j--){
			if(a[j]==key) return j;
		}
		return -1;
	}
	
}
