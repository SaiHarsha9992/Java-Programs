import java.util.*;
import java.lang.*;
class EvenNumber
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
		int l = 0;
		for (int i = 0 ; i < n ; i++ )
		{
			l =(int) Math.log10(a[i])+1;
			if (l%2==0)
			{
				System.out.print(a[i]+" " );
			}
		}
	}

}