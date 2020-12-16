class time
{
	int h,m,s;
	void read(int hh,int mm,int ss)
{
	h=hh;m=mm;s=ss;
}
void display()
{
	System.out.println(h+":"+m+":"+s);
}
};
class timetest
{
   public static void main(String [] args)
 {
 	time t1,t2;
	t1=newtime();
	t2=newtime();
	t1.read(2,12,56);
	t2.read(4,45,10);
	t1.display();
	t2.display();
 }
}