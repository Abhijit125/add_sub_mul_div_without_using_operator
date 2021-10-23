class Multi 
{
	public static void main(String[] args) 
	{
		int a = 2;
		int b = 4;
		int result = 0;
		while( b > 0) {
			if((b & 1) != 0) {
				result = result + a;
			}
			b = b >> 1;
			a = a << 1;
		}
		System.out.println(result);
	}

}
