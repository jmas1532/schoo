class Section7_27 {
	static boolean addMatrix(int[][] x, int[][] y, int[][] z) {
		if(jug(x,y,z)){
			for (int i = 0; i < x.length; i++)
				for (int j = 0; j < x[i].length; j++)
					z[i][j] = x[i][j] + y[i][j];
		return true;
		}
		return false;
		}

	static void printMatrix(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++)
				System.out.print(m[i][j] + "  ");
			System.out.println();
		}
	}
	
	static boolean jug(int[][] x,int[][] y,int[][] z){
		if(x.length==y.length&&x.length==z.length){
			for(int i=0;i<x.length;i++){
				if(x[i].length!=y[i].length||x[i].length!=z[i].length){
					return false;
				}
			}
			return true;
		}else{
			return false;
		}
	}

	public static void main(String[] args) {
		int[][] a = { {1, 2, 3}, {4, 5, 6} };
		int[][] b = { {6, 3, 4}, {5, 1, 2} };
		int[][] c = new int[2][3];

		if(addMatrix(a, b, c)){
			System.out.println(addMatrix(a,b,c));
			System.out.println("s—ña");	printMatrix(a);
			System.out.println("s—ñb");	printMatrix(b);
			System.out.println("s—ñc");	printMatrix(c);
		}else{
			System.out.println(addMatrix(a, b, c));
		}
	}
}
