interface A
{
    interface B
  {
   void display();
  }
}
class C
 {
     void display();
 }
class Nestedtest
{
   public static void main(String[] args)
  {
    C o=new C();
    o.display();
    A=r;
    r=o;
    r.display();
    A.B r1;
    r1=o;
    o.display();
  }
}