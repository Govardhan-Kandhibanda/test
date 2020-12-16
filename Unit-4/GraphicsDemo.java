import java.applet.Applet;
import java.awt.*;
/*
<applet code="GraphicsDemo" width=300 height=500>
</applet>
*/
public class GraphicsDemo extends Applet
{
public void paint(Graphics g)
  {
    g.setColor(Color.blue);
    g.drawString("welcome",100,100);
    g.drawLine(50,40,10,300);
     g.drawRect(80,100,60,70);
     g.fillRect( 80,100,60,70);
     g.drawOval(70,200,30,30);
     g.setColor(Color.red);
    g.fillOval(170,200,60,70);
    g.drawArc(90,150,60,70,60,270);
    g.fillArc(280,160,60,70,0,170);
 }
}



        



























