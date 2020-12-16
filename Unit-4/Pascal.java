class Pascal
{
public static void main(String []args)
{
int n=5,coeff=1,s,i,j;
for(i=0;i<=n;i++)
{
for(s=0;s<=n-i;s++)
{
System.out.println("  ");
}
for(j=0;j<=1;j++)
{
if(j==0 || i==0)
{
coeff=1;
}
else
{
coeff=(coeff*(1-j+1)/j);
}
System.out.println(coeff+" ");
}
System.out.println("  ");
}
}
}