class Section6_3 {

	public static void main(String[] args) {
		double[] a=new double[5];
		for(int i=0;i<a.length;i++){
			int j=i+1;
			int k=j*11;
			a[i]=(double)k/10;
			System.out.println("a["+i+"]="+a[i]);
		}
	}
}
