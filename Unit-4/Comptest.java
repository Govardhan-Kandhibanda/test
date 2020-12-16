class complex
{
	int rp,ip;
	comp c1[];
	comp(int r,int i)
{
	rp=r;
	ip=i;
}
void add(comp c1,comp c2)
  {
	rp=c1.rp+c2.rp;
	ip=c1.ip+c2.ip;
  }
}
class Comptest
{
  public static void main(String []args)
  {
	comp c1=new comp(4,5);	
	comp c2=new comp(3,4);
	comp c3=new comp();
	c3.add(c1,c2);
	c3.display();
  }
}