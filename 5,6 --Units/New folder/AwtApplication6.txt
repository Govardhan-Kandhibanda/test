import java.awt.*;
import java.awt.event.*;
class AwtApplication6 extends Frame implements ActionListener
{
   TextField tf1,tf2,tf3,tf4;
   Button b1,b2;
   AwtApplication6()
   {
      setLayout(new BorderLayout());
      setSize(300,300);
      Panel p1=new Panel();
      Panel p2=new Panel();
      Panel p3=new Panel();
      Panel p4=new Panel();
      
      Label l1=new Label("P");
      Label l2=new Label("T");
      Label l3=new Label("R");
      Label l4=new Label("Result");

      tf1 = new TextField(20);
      tf2 = new TextField(20);
      tf3 = new TextField(20);
      tf4 = new TextField(20);

      b1 = new Button("SI");
      b2 = new Button("Exit");
      
      p1.add(l1);
      p1.add(tf1);
      p1.add(l2);
      p1.add(tf2);
      p1.add(l3);
      p1.add(tf3);
      p3.add(l4);
      p3.add(tf4);
      p4.add(b1);
      p4.add(b2);
     
      
      add(p1,BorderLayout.NORTH);
      add(p2,BorderLayout.WEST);
      add(p3,BorderLayout.CENTER);
      add(p4,BorderLayout.SOUTH);
     
      b1.addActionListener(this);
      b2.addActionListener(this);
      setVisible(true);
   }
  public static void main(String args[])
  {
    AwtApplication6 f = new AwtApplication6();
  }

  public void actionPerformed(ActionEvent ae)
  {
    double p = Double.parseDouble(tf1.getText());
    double t = Double.parseDouble(tf2.getText());
    double r= Double.parseDouble(tf2.getText());
    double res=0;
     if(ae.getSource()==b1)
     {
      res=(p*t*r)/100;
     }
     if(ae.getSource()==b2)
    {
      System.exit(0);
    }
    tf4.setText(String.valueOf(res));
  }
 }   
 
 
      