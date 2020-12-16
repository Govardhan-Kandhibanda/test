import java.applet.Applet;
import java.awt.*;
/*
<applet code="Square" width=500 height=500>
</applet>
*/

public class Square extends Applet
{
    public void init()
    {
        setSize(500, 500);
        setBackground(new Color(186,186,197));
    }
    public void paint(Graphics g)
    { 
	g.setColor(Color.blue);
	g.fillRect(50,50,50,300);
	g.setColor(Color.red);
	g.fillRect(100,50,300,50);
   	g.setColor(Color.green);
	g.fillRect(350,100,50,300);
	g.setColor(Color.yellow);
	g.fillRect(50,350,300,50);
   	g.setColor(Color.green);
	g.fillRect(100,100,50,200);
	g.setColor(Color.blue);
	g.fillRect(300,150,50,200);
	g.setColor(Color.yellow);
	g.fillRect(150,100,200,50);
	g.setColor(Color.red);
	g.fillRect(100,300,200,50);
	g.setColor(Color.red);
	g.fillRect(200,150,100,50);
	g.setColor(Color.yellow);
	g.fillRect(150,250,100,50);
	g.setColor(Color.blue);
	g.fillRect(150,150,50,100);
	g.setColor( Color.green);
	g.fillRect(250,200,50,100);
}
}