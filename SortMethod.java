import java.util.*;
class SortMethod 
{
	public static void main (String args [] )
	{
		Scanner s = new Scanner (System.in);
	int n = s.nextInt();
	int x [] = new int [n];
	for(int i=0;i<n;i++)
	{
		x [ i ] = s.nextInt();
	}
	Arrays.sort(x);
	for (int i = 0 ; i < n ; i++ )
	{
		System.out.print(x[i]+" ");
	}
	}
}