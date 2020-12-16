import java.awt.*;
import java.awt.event.*;
class AwtApplication3 extends Frame implements ActionListener
{
   TextField tf1,tf2,tf3;
   Button b1,b2,b3,b4,b5,b6;
   AwtApplication3()
   {
      setLayout(new BorderLayout());
      setSize(300,300);
      Panel p1=new Panel();
      Panel p2=new Panel();
      Panel p3=new Panel();
      
      Label l1=new Label("First No");
      Label l2=new Label("Second No");
      Label l3=new Label("Result");
      
      tf1 = new TextField(20);
      tf2 = new TextField(20);
      tf3 = new TextField(20);
      
      b1 = new Button("Sum");
      b2 = new Button("Diff");
      b3 = new Button("Mult");
      b4 = new Button("Div");
      b5 = new Button("Modd");
      b6 = new Button("Exit");
      
      p1.add(l1);
      p1.add(tf1);
      p1.add(l2);
      p1.add(tf2);
      p1.add(l3);
      p1.add(tf3);
      p1.add(b1);
      p1.add(b2);
      p1.add(b3);
      p1.add(b4);
      p1.add(b5);
      p1.add(b6);
      
      add(p1,BorderLayout.NORTH);
      add(p2,BorderLayout.CENTER);
      add(p3,BorderLayout.SOUTH);
      b1.addActionListener(this);
      b2.addActionListener(this);
      b3.addActionListener(this);
      b4.addActionListener(this);
      b5.addActionListener(this);
      b6.addActionListener(this);
      setVisible(true);
   }
  public static void main(String args[])
  {
    AwtApplication3 f = new AwtApplication3();
  }

  public void actionPerformed(ActionEvent ae)
  {
    int a = Integer.parseInt(tf1.getText());
    int b = Integer.parseInt(tf2.getText());
    int c=0;
     if(ae.getSource()==b1)
     {
      c=a+b;
     }
     if(ae.getSource()==b2)
    {
      c=a-b;
    }
    if(ae.getSource()==b3)
    {
      c=a*b;
    }
    if(ae.getSource()==b4)
    {
      c=a/b;
    }
    if(ae.getSource()==b5)
    {
      c=a%b;
    }
     if(ae.getSource()==b6)
    {
      System.exit(0);
    }
    tf3.setText(String.valueOf(c));
  }
 }   
 
 
      