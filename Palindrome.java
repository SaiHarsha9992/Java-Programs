import java.util.*;
class Palindrome {
	public static int Pali ( int n ) 
	{
		int r , s = 0 , t = n ;
		while ( t != 0 )
		{
			r = t % 10 ;
			s = s * 10 + r ;
			t = t / 10 ;
		}
		if ( s == n )
		{
			return 1 ;
		}
		else
		{
			return 0 ;
		}
	}
	public static void main ( String arg [] ) 
	{
		Scanner s = new Scanner ( System . in ) ;
		int n = s . nextInt () ;
		int x = Pali(n) ;
		if ( x == 1 )
                {
			System . out . println ( "Palindrome" ) ;
		}
		else
		{
			System . out . println ( "Not Palindrome" ) ;	
		}
	}
}
												