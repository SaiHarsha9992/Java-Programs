import java.lang.*;
import java.util.*;

class Demo 
{
	public static void main (String args [] )
	{
		Scanner s = new Scanner (System.in);
		int m,n;
		m = s.nextInt();
		n = s.nextInt();
		System.out.println(Math.max(m,n));
		System.out.println(Math.min(m,n));
		System.out.println(Math.sqrt(m));
		System.out.println(Math.cbrt(m));
	}
}