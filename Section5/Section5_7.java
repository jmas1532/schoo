class Section5_7 {
	public static void main(String[] args) {
		System.out.println("”’l   2æ’l");
		System.out.println("-----------");
		
		for(float x=0.0F;x<=1.0F;x+=0.001F){
			float y=x*x;
			System.out.printf("%.7f   %.7f\n",x,y);
		}
		
	}
}
