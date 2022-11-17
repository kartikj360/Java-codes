class shortcircuit {

	public static void main(String[] args){

		int x=23;

		int y=8;

		if((++x)==24 && (++y)==9)
		{

			System.out.println(x);
	
			System.out.println (y);
		}
		x=35;
		y=0;

		if(++x==26||++y==1)

		{

			System.out.println (x); 
			
			System.out.println (y);

		}
	}
}