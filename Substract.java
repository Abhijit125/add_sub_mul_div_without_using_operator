import java.util.*;
class Algo1 
{
	public static void main(String args[]) {
		int a = 3;
		int b = 5;
		while(b != 0) {
			int carry = ~a & b;
			a = a ^ b;
			b = carry << 1;
		}
		System.out.println(a);
	}
	
}
