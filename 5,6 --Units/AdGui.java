import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.*;
import java.io.*;
public class AdGui
{
	public static void main(String[] args) {
		//Addition obj = new Addition();
		System.out.println("safdas");
	}
}


class Addition extends JFrame implements ActionListener
{	
	JTextField t1,t2,t3;
	JLabel l1,l2,l3;
	JButton b1,b2,b3,b4,b5,b6;

	public Addition()
	{   
		t1 = new JTextField(20);
		t2 = new JTextField(20);
                                   t3 =new JTextField(20);
		
		Label l1=new Label("First No");
      		Label l2=new Label("Second No");
      		Label l3=new Label("Result");
		
		 b1 = new JButton("Sum");
     		 b2 = new JButton("Diff");
      		 b3 = new JButton("Mult");
     		 b4 = new JButton("Div");
     		 b5 = new JButton("Modd");
     		 b6 = new JButton("Exit");
		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);

		b1.addActionListener(this); 
		b2.addActionListener(this);
     		b3.addActionListener(this);
      		b4.addActionListener(this);
      		b5.addActionListener(this);
      		b6.addActionListener(this);

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent ae)
	{
		float a = Float.parseFloat(t1.getText());
		float b = Float.parseFloat(t2.getText());

		float c=0;
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

		t3.setText(c+"");

	}
}

