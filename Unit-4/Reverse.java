class Reverse
{
 public static void main(String []args)
{
 int n=1234,x,count=0;
  while(n!=0)
{
 x=n%10;
count=count*10+x;
n=n/10;
}
System.out.println(count);
}
}