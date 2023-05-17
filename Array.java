import java.util.*;
class Array
{
	public static void main (String args [] )
	{
		Scanner s = new Scanner ( System.in );
		int n = s . nextInt();
		int x []= new int [n];
		for (int i = 0 ; i < n  ; i++  )
		{
			x[i]=s.nextInt();
		}
		int min = Integer.MAX_VALUE;
		for (int i = 0 ; i < n  ; i++  )
		{
			if (x [ i ] < min )
			{
				min = x [ i ] ;
			}
		}
		System.out.println("MINIMUM in the array"+min);
	}
}