import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

public class AWTGraphics extends Frame
{
  public AWTGraphics()
  {
    setTitle("Java AWT Graphics");
    setSize(350, 300);
    setVisible(true);
  }
  
  public void paint(Graphics g) // Callback Method
  {
    Color clr1 = new Color(0, 0, 255); 
    Color clr2 = new Color(255, 255, 255); 
    Color clr3 = new Color(0, 0, 0); 
    Color clr4 = new Color(255, 0, 0); 
    Font f1 = new Font("TimesNewRoman", Font.ITALIC, 18); 
    g.setColor(clr1);
    g.fillRect(75, 100, 200, 100);
    g.setColor(clr2);
    g.drawLine(105, 152, 240, 152);
    g.setColor(clr3);
    g.drawOval(45, 70, 260, 160);
    g.setFont(f1);
    g.setColor(clr4);
    g.drawString("JAVA Programming Lab", 77, 150);
  } 
  
  public static void main(String args[])
  {
    new AWTGraphics();
  }
} 
