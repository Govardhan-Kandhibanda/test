import java.awt.*;
import java.awt.event.*;
public class awtAdd extends Frame implements ActionListener
{
TextField t1,t2,t3;
Button b1,b2,b3,b4;
awt()
{
setLayout(new BorderLayout());
setSize(300,300);
Panel p1=new Panel();
Panel p2=new Panel();
Panel p3=new Panel();
Label l1=new Label("First No");
Label l2=new Label("Second No:");
Label l3=new Label("Result: ");
t1=new TextField(20);
t2=new TextField(20);
t3=new TextField(20);
b1=new Button("SUM");
b2=new Button("DIFF");
b3=new Button("MUL");
b4=new Button("EXIT");
p1.add(l1);p1.add(t1);
p1.add(l2);p1.add(t2);
p2.add(l3);p2.add(t3);
p3.add(b1);p3.add(b2);p3.add(b3);p3.add(b4);
add(p1,BorderLayout.NORTH);
add(p2,BorderLayout.CENTER);
add(p3,BorderLayout.SOUTH);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
setVisible(true);
}
public static void main(String[] args)
{
awt f=new awt();
}
public void actionPerformed(ActionEvent ae)
{
int a=Integer.parseInt(t1.getText());
int b=Integer.parseInt(t2.getText());
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
System.exit(0);
}
t3.setText(String.valueOf(c));
}
}