import java.applet.Applet;
import java.awt.*;
/*
<applet code="GraphicsDemo" width=300 height=500>
</applet>
*/
public class GraphicDemo extends applet
{
public void paint(Graphic g)
  {
    g.setColor(color.red);
    g.drawstring("welcome",50,50);
    g.drawline(20,30,20,300);
     g.drawrect(70,100,30,30);
     g.fillrect( 70,100,30,30);
     g.drawoval(70,200,30,30);
     g.setcolor(color.pink);
    g.filloval(170,200,30,30);
    g.drawarc(90,150,30,30,30,270);
    g.fillarc(270,150,30,30,0,1800;
 }
}


        



























