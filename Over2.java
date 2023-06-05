import java.util.*;
class Over2
{
	public void swap (char c1 , char c2 )
	{
		System . out. println ("Before Swaping");
		System . out . println ( c1+" "+c2 ) ;
		char c;
		c = c1;
		c1 = c2 ;
		c2 = c;
		System . out . println ("After Swapping");
		System . out . println (c1+"" +c2); 
	}
		public void swap (int n1 , int n2 )
	{
		System . out. println ("Before Swaping");
		System . out . println ( n1+" "+n2 ) ;
		int n;
		n = n1;
		n1 = n2 ;
		n2 = n;
		System . out . println ("After Swapping");
		System . out . println (n1+" "+n2); 
	}
		public void swap (double d1 , double d2 )
	{
		System . out. println ("Before Swaping");
		System . out . println ( d1+" "+d2 ) ;
		double d;
		d = d1;
		d1 = d2 ;
		d2 = d;
		System . out . println ("After Swapping");
		System . out . println (d1+"" +d2); 
	}
	public static void main ( String args [] )
	{
		Over2 o = new Over2() ;
	Scanner s = new Scanner (System.in);
	int a,b;
	double c,d;
	char e,f;
	a = s.nextInt () ;
	b = s.nextInt () ;
	c = s.nextDouble () ;
	d = s.nextDouble () ;
	s.nextLine();
	e = s.nextLine().charAt(0) ;
	f = s.nextLine().charAt(0) ;
	o.swap(a,b);
	o.swap(c,d);
	o.swap(e,f);
	}
}
