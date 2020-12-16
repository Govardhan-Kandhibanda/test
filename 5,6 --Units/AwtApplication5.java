import java.awt.*;
import java.awt.event.*;
class AwtApplication5 extends Frame implements ActionListener
{
   TextField tf1,tf2,tf3,tf4;
   Button b1,b2,b3;
   AwtApplication5()
   {
      setLayout(new BorderLayout());
      setSize(300,300);
      Panel p1=new Panel();
      Panel p2=new Panel();
      Panel p3=new Panel();
      Panel p4=new Panel();
      
      Label l1=new Label("a=");
      Label l2=new Label("b=");
      Label l3=new Label("c=");
      Label l4=new Label("res=");
      
      tf1 = new TextField(20);
      tf2 = new TextField(20);
      tf3 = new TextField(20);
      tf4 = new TextField(20);
      
      b1 = new Button("r1");
      b2 = new Button("r2");
      b3 = new Button("EXIT");
      p1.add(l1);
      p1.add(tf1);
      p1.add(l2);
      p1.add(tf2);
      p1.add(l3);
      p1.add(tf3);
      p1.add(l4);
      p1.add(tf4);
      p1.add(b1);
      p1.add(b2);
      p1.add(b3);
  
      add(p1,BorderLayout.NORTH);
      add(p2,BorderLayout.EAST);
      add(p3,BorderLayout.WEST);
      add(p4,BorderLayout.SOUTH);

      b1.addActionListener(this);
      b2.addActionListener(this);
      b3.addActionListener(this);
      setVisible(true);
   }
  public static void main(String args[])
  {
    AwtApplication5 f = new AwtApplication5();
  }

  public void actionPerformed(ActionEvent ae)
  {
    int a = Integer.parseInt(tf1.getText());
    int b = Integer.parseInt(tf2.getText());
    int c = Integer.parseInt(tf3.getText());
    float res = 0; 
        double root1, root2;
        double determinant = b * b - 4 * a * c;
        if(determinant > 0) {
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);
            System.out.format("root1 = %.2f and root2 = %.2f", root1 , root2);
        }
        else if(determinant == 0) {
            root1 = root2 = -b / (2 * a);
            System.out.format("root1 = root2 = %.2f;", root1);
                   
       }
       
        
     if(ae.getSource()==b4)
    {
      System.exit(0);
    }
    tf4.setText(String.valueOf(res));
  }
 }   
 
 
      