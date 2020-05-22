class Section5_6 {
	public static void main(String[] args) {
		System.out.println("float   int");
		System.out.println("-----------");
		
		for(float x=0.0F,y=0;x<=1.0F;x+=0.001F,y++){
			float z=(float)y/1000;
			System.out.printf("%.7f   %.7f\n",x,z);
		}
		
	}
}
