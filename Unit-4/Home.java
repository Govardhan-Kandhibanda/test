import java.awt.*;
import java.applet.*;

/*
<applet code="Home" width=400 height=450>
</applet>
*/
public class Home extends Applet
{
public void paint(Graphics g)
{
 int [] x = {150, 300, 225};
int [] y = {150, 150, 25};
g.setColor(Color.blue);
g.drawRect(150, 150, 150, 200);
g.setColor(Color.orange);
g.drawRect(200, 200, 50, 150); 
g.setColor(Color.red);
g.drawOval(200, 75, 50, 50); 
g.setColor(Color.black);
g.drawPolygon(x, y, 3); 
}
}