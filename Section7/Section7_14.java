import java.util.Scanner;
class Section7_14 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.print("整数値：");
		int x=stdIn.nextInt();
		System.out.print("posビット目：");
		int pos=stdIn.nextInt();
		System.out.print("ビット数：");
		int n=stdIn.nextInt();
		System.out.println("setNメソッド："+setN(x,pos,n));
		System.out.println("resetNメソッド："+resetN(x,pos,n));
		System.out.println("inverseNメソッド："+inverseN(x,pos,n));
		
	}
	
	static int set(int n){
		int e=1;
		for(int i=n;i>0;i--){
			while(i-->0) e*=2;
		}
		return (e-1);
	}
	
	static int setN(int x,int pos,int n){
		return x|(set(n)<<pos);
	}
	
	static int resetN(int x,int pos,int n){
		return setN(x,pos,n)^(set(n)<<pos);
	}
	
	static int inverseN(int x,int pos,int n){
		for(int j=0;j<n;j++){
			if(((x>>(pos+j))&1)==1){
				x= resetN(x,pos+j,1);
			}else{
				x= setN(x,pos+j,1);
			}
		}
		return x;
	}
}
