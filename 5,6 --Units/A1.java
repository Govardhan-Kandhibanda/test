import java.applet.Applet;  
import java.awt.*;  
  
public class A1 extends Applet{  
  
public void paint(Graphics g){ 
g.setColor(Color.green); 
g.drawRect(100,100,600,400); 
g.fillRect(100,100,600,100); 
g.fillRect(100,400,600,100); 
g.setColor(Color.blue);  
g.fillRect(100,200,100,200);  
g.fillRect(600,200,100,200);  
g.drawRect(200,200,400,200);
g.setColor(Color.pink);    
g.drawOval(230,260,80,80); 
g.fillOval(230,260,80,80); 
g.drawOval(490,260,80,80); 
g.fillOval(490,260,80,80); 
g.setColor(Color.green);  
g.drawRect(350,250,100,100); 


}  
}  

/*
<applet code="A1.class" width="1000" height="1000">  
</applet>
*/  