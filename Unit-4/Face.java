import java.awt.*;
import java.applet.*;
/*
<applet code="face"  width=500height=500>
</applet>
*/
public class Face extends Applet
{
public void paint(Graphics g)
  {
      g.drawOval(40,40,120,150);
   //g.fillArc(50,40,80,40,180,180);
    g.drawOval(57,75,30,20);
    g.drawOval(110,75,30,20);
    g.fillOval(68,81,10,10);
    g.fillOval(121,81,10,10);
    g.fillOval(85,100,25,25);
    g.setColor(Color.red);
    g.fillArc(60,125,80,40,180,180);
    g.setColor(Color.black);
    g.fillOval(25,92,14,36);
   g.drawOval(25,92,14,30);
   g.fillOval(25,92,14,30);
   g.drawOval(160,92,15,30);
 } 
}
        