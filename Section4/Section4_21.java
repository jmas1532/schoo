import java.util.Scanner;

public class Section4_21 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		
		
		System.out.print("�i���́F");
		int n=stdIn.nextInt();
		
		System.out.println("���㒼�p�̎O�p�`��\�����܂��B");
		for(int i=n;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("�E�����p�̎O�p�`��\�����܂��B");
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(j<=(n-i)){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
			
		System.out.println("�E�㒼�p�̎O�p�`��\�����܂��B");
		
		for(int i=1;i<=n;i++){
			for(int j=n;j>=1;j--){
				if(j>(n-i+1)){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
	}
}