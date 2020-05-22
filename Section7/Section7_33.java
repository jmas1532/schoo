
import java.util.Scanner;
class Section7_33 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.print("1次元配列の要素数：");
		int[] a=new int[stdIn.nextInt()];
		for(int i=0;i<a.length;i++){
			System.out.print("a["+i+"]=");
			a[i]=stdIn.nextInt();
		}
		System.out.print("2次元配列の要素数：");
		int[][] b=new int[stdIn.nextInt()][];
		for(int j=0;j<b.length;j++){
			System.out.print("a["+j+"]の要素数：");
			b[j]=new int[stdIn.nextInt()];
		}
		for(int s=0;s<b.length;s++){
			for(int t=0;t<b[s].length;t++){
				System.out.print("a["+s+"]["+t+"]：");
				b[s][t]=stdIn.nextInt();
			}
		}
		System.out.println("1次元配列の表示例");
		printArray(a);
		System.out.println("2次元配列の表示例");
		printArray(b);
	}
	static void printArray(int[] a){
		for(int i:a){
			System.out.printf("%-6d",i);
		}
		System.out.println();
	}
	static void printArray(int[][] a){
		for(int[] i:a){
			for(int j:i){
				System.out.printf("%-6d",j);
			}
			System.out.println();
		}
	}
	
}