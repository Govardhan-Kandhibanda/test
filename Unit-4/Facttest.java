class Facttest
{
  static int fact(int n)
{
  int F=1;
  int i;
 for(i=1;i<=n;i++)
{
 F=F*i;
}
return(F);
}
public static void main(String []args)
{
int x;
x=Facttest.fact(5);
System.out.println(x);
}
}
