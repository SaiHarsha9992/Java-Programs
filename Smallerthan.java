import java.util.*;
import java.lang.*;
class Smallerthan
{
	public static void main(String args[])
	{
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for (int i = 0 ;  i < n ; i++ )
		{
			a[i] = s.nextInt();
		}
		int c = 0;
		for (int i = 0 ; i < n ; i++ )
		{
			c = 0;
			for (int j = 0 ; j < n ; j++ )
			{
				if ( a[j] < a[i])
				{
					c++;
				}
			}
			System.out.print(c+" ");
		}
	}

}