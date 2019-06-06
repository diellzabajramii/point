import javax.swing.*;
import java.awt.*;
public class PointGraphDistance extends JPanel
{
   private int xposition;
   private int yposition;
   private int axis_length;
   private String x_label;
   private String y_label;
   private int x1,y1;
   private int x2,y2;
   private int x3,y3;
   private int x4,y4;
   private int x5,y5;
   private int x6,y6;
   private int width = 600;
   private int x_length;

   public PointGraphDistance()
   { 
      JFrame obj = new JFrame();
      obj.setSize(width,width);
      obj.getContentPane().add(this);
      obj.setVisible(true);
   }
   public void paintComponent(Graphics g){
      g.setColor(Color.white);
      g.fillRect(0,0,width,width);
   
      g.setColor(Color.black);
   
      g.drawLine(xposition,yposition,xposition+axis_length,yposition);
      g.drawLine(xposition,yposition,xposition,yposition-axis_length+93);
      
      g.drawString("Distanca e automobilit për kohën e caktuar në varësi me shpejtësi 'v' dhe me nxitim 'a' ",xposition-100,yposition-260);
   
      g.drawString("0",xposition-15,yposition);
      g.drawString("0",xposition,yposition+15);
      g.drawString("1km",xposition+32,yposition+15);
      g.drawString("2km",xposition+64,yposition+15);
      g.drawString("3km",xposition+100,yposition+15);
      g.drawString("4km",xposition+140,yposition+15);
      g.drawString("5km",xposition+180,yposition+15);
      g.drawString("6km",xposition+220,yposition+15);
      g.drawString("d",xposition+230,yposition);
      g.drawString("2",xposition-15,yposition-20);
      g.drawString("4",xposition-15,yposition-40);
      g.drawString("6",xposition-15,yposition-60);
      g.drawString("8",xposition-15,yposition-80);
      g.drawString("10",xposition-20,yposition-100);
      g.drawString("t",xposition-15,yposition-120);
      
      g.fillOval(x1-2,y1-2,4,4);
      g.fillOval(x2-2,y2-2,4,4);
      g.fillOval(x3-2,y3-2,4,4);
      g.fillOval(x4-2,y4-2,4,4);
      g.fillOval(x5-2,y5-2,4,4);
      g.fillOval(x6-2,y6-2,4,4);
   
   
   
      g.setColor(Color.red);
      g.drawLine(x1,y1,x2,y2);
      g.drawLine(x2,y2,x3,y3);
      g.drawLine(x3,y3,x4,y4);
      g.drawLine(x4,y4,x5,y5);
      g.drawLine(x5,y5,x6,y6);
   
   }
   public void setAxes(int xposition,int yposition,int axis_length,String x_label,String y_label)
   {
      this.xposition = xposition;
      this.yposition=yposition;
      this.axis_length=axis_length;
      this.x_label=x_label;
      this.y_label=y_label;
      x_length=axis_length/6;
   }
   public void setPoint1(int height)
   {
      y1=yposition-height;
      x1=xposition;
      repaint();
   }
   public void setPoint2(int height)
   {
      y2=yposition-height;
      x2=xposition + x_length;
      repaint();
   }
   public void setPoint3(int height)
   {
      y3=yposition-height;
      x3=xposition+x_length*2;
      repaint();
   }
   public void setPoint4(int height)
   {
      y4=yposition-height;
      x4=xposition+x_length*3;
      repaint();
   }
   public void setPoint5(int height)
   {
      y5=yposition-height;
      x5=xposition+x_length*4;;
      repaint();
   }
   public void setPoint6(int height)
   {
      y6=yposition-height;
      x6=xposition+x_length*5;
      repaint();
   }

}