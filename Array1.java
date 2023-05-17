import java.util.*;
class Array1
{
	public static int findMax (int a[])
	{
		int max = Integer.MIN_VALUE;
		for (int i = 0 ; i < a.length  ; i++  )
		{
			if (a [ i ] > max )
			{
				max = a [ i ] ;
			}
		}
		return max;
	}
	public static void main (String args [] )
	{
		Scanner s = new Scanner ( System.in );
		int n = s . nextInt();
		int x []= new int [n];
		for (int i = 0 ; i < n  ; i++  )
		{
			x[i]=s.nextInt();
		}
		int max = Array1.findMax(x); 
		System.out.println("MAXIMUM in the array"+max);
	}
}