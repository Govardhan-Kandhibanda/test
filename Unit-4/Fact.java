import java.awt.*;
import java.applet.*;

class awtfact extends frame implements ActionListener
 {
   TextField t1;
   Button b1,b2;
   Awtfact()
    {
        set layout (new BorderLayout ());
        setSize (300,500);
        Panel p1=new panel();
        Panel p2=new panel ();
        label l1=new label ("enter number");
        label l2=new label ("result");
        tf1=new TextField (10);
        tf2=new TextField (10);
        p1.add(t1);
        p2.add(t2);
        p2.add(tf2);
        p2.add(b1);
        p2.add(b2);
        add(p1.BorderLayout CENTER);
        add(p2.BorderLayout SOUTH);
        b1.add ActionListener (this);
        b2.add ActionListener (this);	
        setVisible(true);
    }
public static void main(String[] args)
{
 Awtfact=new awtfact();
}
public void ActionPerformed (ActionEvent ae)
{
   if(ae.getsource()==b1)
    {
       int fact;
      interger.parce int (t1.get text( ));
      fact=1;
      for(int i=1;i<=n;i++)
       {
	fact=fact*1;
       }
  }
 tf2.setText (String value of(fact)) 
 if(ae.getsource ==b2)
 {
  system.exit(0);
 }
}
			

   
     


  

    

   
  