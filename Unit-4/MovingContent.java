
package Applet;

import java.awt.*;
import java.applet.*;

public class MovingContent extends Applet implements Runnable 
{
	// enter message
	String msg = "Welcome to Includehelp.";
	Thread t = null;
	
	// initialize here.
	int state;
	boolean stopFlag;

	// Set colors and initialize text..
	public void init() 
	{
		setBackground(Color.cyan);
		setForeground(Color.red);
	}

	// Start the text....
	public void start() 
	{
		t = new Thread(this);
		stopFlag = false;
		t.start();
	}

	// Entry point which runs the text.
	public void run() 
	{
		char ch;
		
		// Display text reapeated times.
		for( ; ; ) 
		{
			try 
			{
				repaint();
				Thread.sleep(250);
				ch = msg.charAt(0);
				msg = msg.substring(1, msg.length());
				msg += ch;
				if(stopFlag)
					break;
			}
			catch(InterruptedException e) 
			{
				System.out.println(e);
			}
		}
	}

	// Pause the text.
	public void stop() 
	{
		stopFlag = true;
		t = null;
	}

	// Display the text.
	public void paint(Graphics g) 
	{
		g.drawString(msg, 50, 30);
	}
}