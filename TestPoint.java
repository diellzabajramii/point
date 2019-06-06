public class TestPoint
{
  public static void main(String[] args)
  { PointGraphWriter e = new PointGraphWriter();
    e.setAxes(200, 250, 200, "6 Jave", "90 °F");

    int scale_factor = 6;
    e.setPoint1(3* scale_factor);   
    e.setPoint2(15 * scale_factor);   
    e.setPoint3(7 * scale_factor);  
    e.setPoint4(15 * scale_factor);  
    e.setPoint5(1* scale_factor);
    e.setPoint6(30 * scale_factor);
  }
}