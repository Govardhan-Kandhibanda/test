import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddGui
{
	public static void main(String[] args) {
		Addition obj = new Addition();
	}
}


class Addition extends JFrame implements ActionListener
{	
	JTextField t1,t2;
	JLabel l1;
	JButton b1;

	public Addition()
	{   
		t1 = new JTextField(20);
		t2 = new JTextField(20);
		l1 = new JLabel("Result");
		b1 = new JButton("OK");
		
		add(t1);
		add(t2);
		add(l1);
		add(b1);
		b1.addActionListener(this); 

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent ae)
	{
		int num1 = Integer.parseInt(t1.getText());
		int num2 = Integer.parseInt(t2.getText());

		int value = num1 + num2;

		l1.setText(value+"");




	}
}

