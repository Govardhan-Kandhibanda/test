class Fib
{
 public static void main(String []args)
     {
	 int a=0,b=1,fib,n=5,i=3;
        do
	{
	   fib=a+b;
	   System.out.println(fib);
	    a=b;
	    b=fib;
	    i++;
	}
            while(i<=n);
     }
}