
class RBI
{
  void displayRBI(){
    System.out.println("I am RBI and I am a Central Bank");
  }
}

class SBI extends RBI
{
  void displaySBI(){
    System.out.println("I am SBI and I am under Central Bank");
  }
}

class HDFC extends RBI
{
  void displayHDFC(){
    System.out.println("I am HDFC and I am under Central Bank");
  }
}

class ICICI extends RBI
{
  void displayICICI(){
    System.out.println("I am ICICI and I am under Central Bank");
  }
}


class HierarchicalInterfaceTest
{
  public static void main(String[] args)
  {
    SBI s = new SBI();
    s.displaySBI();
    s.displayRBI();
    HDFC h = new HDFC();
    h.displayHDFC();
    h.displayRBI();
   }
}
