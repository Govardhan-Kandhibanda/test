import java.awt.*;
import java.awt.event.*;
class AwtApplication4 extends Frame implements ActionListener
{
   TextField tf1,tf2,tf3;
   Button b1,b2,b3,b4;
   AwtApplication4()
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
      
      b1 = new Button("Max");
      b2 = new Button("Min");
      b3 = new Button("Exit");
      
      p1.add(l1);
      p1.add(tf1);
      p1.add(l2);
      p1.add(tf2);
      p1.add(l3);
      p1.add(tf3);
      p1.add(b1);
      p1.add(b2);
      p1.add(b3);
  
      add(p1,BorderLayout.NORTH);
      add(p2,BorderLayout.CENTER);
      add(p3,BorderLayout.SOUTH);
      
      b1.addActionListener(this);
      b2.addActionListener(this);
      b3.addActionListener(this);
      setVisible(true);
   }
  public static void main(String args[])
  {
    AwtApplication4 f = new AwtApplication4();
  }

  public void actionPerformed(ActionEvent ae)
  {
    int a = Integer.parseInt(tf1.getText());
    int b = Integer.parseInt(tf2.getText());
    int c=0;
     if(ae.getSource()==b1)
     {
          if(a>b)
          {
            c=a;
          }
          else
          {
            c=b;
          }
     }
     if(ae.getSource()==b2)
    {
        if(a<b)
          {
            c=a;
          }
          else
          {
            c=b;
          }
    }
     if(ae.getSource()==b3)
    {
      System.exit(0);
    }
    tf3.setText(String.valueOf(c));
  }
 }   
 
 
      