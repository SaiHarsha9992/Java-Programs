import java.util.*;
class Triangle
{ 
    public static void main ( String args [] ) 
	{
		Scanner s = new Scanner ( System . in ) ;
		int a = s . nextInt () ;
		int b = s . nextInt () ;
		int c = s . nextInt () ;
		if ( a == b && b == c && c == a ) 
		System . out . println ( "EQUILATORAL" ) ;
		else if ( a == b || b == a || c == a )
		System . out . println ( "ISOSCELES" ) ;
		else
		System . out . println ( "SCALENCE" ) ;
	}
}