import java.awt.*;
import javax.swing.*;

public class PointGraphWriter extends JPanel
{ JFrame grafiku = new JFrame();

   private int x1;  
   private int y1;  
   private int x2;  
   private int y2;    
   private int length; 
   private int xpika; 
   private int ypika; 
   private int diameter;
   private String x_l;
   private String y_l;
   private int x1pika; 
   private int y1pika;
   private int x2pika; 
   private int y2pika;
   private int x3pika; 
   private int y3pika;
   private int x4pika; 
   private int y4pika;
   private int x5pika; 
   private int y5pika;
  

   public PointGraphWriter()
   { int gjeresia=600;
   
      grafiku.getContentPane().add(this);
      grafiku.setTitle("Grafiku");
      grafiku.setSize(gjeresia, gjeresia);
      grafiku.setVisible(true);
   }

   public void paintComponent(Graphics g)
   {
      x2= x1+length;
      y2=y1-length;
      diameter=5;
      xpika= x1+(x1/6);
      x1pika=x1+((2*x1)/6);
      x2pika=x1+((3*x1)/6);
      x3pika=x1+((4*x1)/6);
      x4pika=x1+((5*x1)/6);
      x5pika=x1+((6*x1)/6);
      
      
      g.drawLine(x1,y1,x2,y1);
      g.drawLine(x1,y1,x1,y2);
      
      g.drawString(x_l, x2, y1+15);
      g.drawString(y_l,x1-15,y1-length);
      g.drawString("Ndryshimi i temperatures ne 6 javet e fundit." ,10,10);
      
        
      g.drawString("0",x1-15,y1);
      g.drawString("5",x1-15,y1-((length/6)));
      g.drawString("10",x1-15,y1-((2*length)/6));
      g.drawString("15",x1-15,y1-((3*length)/6));
      g.drawString("20",x1-15,y1-((4*length)/6));
      g.drawString("25",x1-15,y1-((5*length)/6));
      
      g.drawString("0", x1,y1+15);
      g.drawString("1", x1+(x1/6),y1+15);
      g.drawString("2", x1+((2*x1)/6),y1+15);
      g.drawString("3", x1+((3*x1)/6),y1+15);
      g.drawString("4", x1+((4*x1)/6),y1+15);
      g.drawString("5", x1+((5*x1)/6),y1+15);
      
      
      g.fillOval(x1,y1,diameter ,diameter);
      g.fillOval(xpika,y1-ypika-5,diameter ,diameter);
      g.fillOval(x1pika,y1-y1pika-5,diameter ,diameter);
      g.fillOval(x2pika,y1-y2pika-5,diameter ,diameter);
      g.fillOval(x3pika,y1-y3pika-5,diameter ,diameter);
      g.fillOval(x4pika,y1-y4pika-5,diameter ,diameter);
      g.fillOval(x5pika,y1-y5pika-5,diameter ,diameter);
      
      g.setColor(Color.red);
      g.drawLine(x1,y1,xpika,y1-ypika-2);
      g.drawLine(xpika,y1-ypika-2,x1pika,y1-y1pika-2);
      g.drawLine(x1pika,y1-y1pika-2,x2pika,y1-y2pika-2);
      g.drawLine(x2pika,y1-y2pika-2,x3pika,y1-y3pika-2);
      g.drawLine(x3pika,y1-y3pika-2,x4pika,y1-y4pika-2);
      g.drawLine(x4pika,y1-y4pika-2,x5pika,y1-y5pika-2);
      
      g.setColor(Color.black);
      g.fillOval(x1+(x1/6),y1,4 ,4);
      g.fillOval(x1+(2*x1/6),y1,4,4);
      g.fillOval(x1+(3*x1/6),y1,4,4);
      g.fillOval(x1+(4*x1/6),y1,4,4);
      g.fillOval(x1+(5*x1/6),y1,4,4);
      g.fillOval(x1+(6*x1/6),y1,4,4);
          
   }

   public void setAxes(int x_pos, int y_pos, int axis_length, String x_label, String y_label)
   {
      x1= x_pos;
      y1=y_pos;
      length= axis_length;
      x_l = x_label;
      y_l = y_label;   
   }

   public void setPoint1(int height)
   {  
      ypika=height;
      xpika =height+x1;
      this.repaint();
   }

   public void setPoint2(int height1)
   { 
      y1pika=height1;
      x1pika =height1+10+x1;
      this.repaint();
     
   }   
   
   public void setPoint3(int height2)
   {
      y2pika=height2;
      x2pika = height2+20+x1;
      this.repaint();
   }
   public void setPoint4(int height3)
   {
      y3pika=height3;
      x3pika = height3+30+x1;
      this.repaint();
   }
   public void setPoint5(int height4)
   {
      y4pika =height4;
      x4pika= height4+40+x1;
      this.repaint();
   }

   public void setPoint6(int height5)
   {
      y5pika=height5;
      x5pika = height5+50+x1;
      this.repaint();
   }
   }
  