interface A
{
    interface B
  {
   void display();
  }
}
class C implements A.B
 {
   public void display()
   {
      System.out.println("inner");
   }
}
class Interfacetest
{
   public static void main(String[] args)
  {
    C o=new C();
    o.display();
  
    A.B r1;
    r1=o;
    o.display();
  }
}