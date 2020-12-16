class Count
{
public static void main(String []args)
{
int n=12,count=0,i,sum=0,r;
while(n!=0)
{
r=n%10;
sum=(sum*10)+r;
n=n/10;
count=count+1;
}
System.out.println(count);
}
}
