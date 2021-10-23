class Divide 
{
	public static void main(String[] args) 
	{
		long dividend = -30;
		long divisor = -2;
		long sign = ((dividend < 0) ^
            (divisor < 0)) ? -1 : 1;

		dividend = Math.abs(dividend);
		divisor = Math.abs(divisor);


		long quotient = 0, temp = 0;

		for (int i = 31; i >= 0; --i)
		{
			if (temp + (divisor << i) <= dividend)
			{
				temp += divisor << i;
				quotient |= 1L << i;
			}
			
		}
		if(quotient == -1)
			quotient = -quotient;
		System.out.println(quotient);
	}
}
