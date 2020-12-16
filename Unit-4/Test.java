class A
{
    class  B
{
void display()
   {
             System.out.println("im in class");
   }	 
}
void test()
    {
	B bo=new B();
	bo.display();
    }

class Test
{
   public static void main(String []args)
      {
	A o=new A();

   	o.test();
     }
}  
}