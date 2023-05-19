import java.util.*;
public class Example
{
    public static void main(String args[])
    {
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        int a[] = new int [n];
        for ( int i = 0 ; i < n ; i++ )
        {
            a[i]=s.nextInt();
        }
        if(n==1)
        {
            System.out.println(1);
        }
        else
        {
            int b[] = new int[n];
            int c[] = new int[n];
            int k = 0 , l = 0 , su = 0 , p = 0 ;
            for ( int i = 0 ; i < n ; i++ )
            {
               su = su + a[i];
               b[k++] = su;
            }
            for ( int j = n-1 ; j >= 0 ; j-- )
            {
                p = p + a[j];
                c[l++] = p;
            }
            int u = 0 , flag = 0 ;
            int d[] = new int [n];
			int m = 0;
			for ( int w = n-1 ; w >= 0 ; w-- )
			{
				d[m++]=c[w];
			}
			for ( int t = 0 ; t < n ; t++ )
            {
                    if ( b[t] == d[t])
                    {
                        u = t;
                        flag = 1;
                        break;
                    }
            }
            if ( flag == 1 )
            {
                System.out.println(u+1);
            }
            else
            {
                System.out.println(-1);
            }
        }
    }
}