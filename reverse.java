class reverse
{
  public static void main(String []args)
 {
  int n=1234,x,rev=0;
  while(n!=0)
  {
    x=n%10;
    rev=rev*10+x;
    n=n/10;
  }
  System.out.println(rev);
 }
}