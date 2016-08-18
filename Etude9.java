import java.awt.*;
import javax.swing.*;


public class Etude9 extends JFrame{
  
  private static int scale = 700;
  
  public static void main(String[] args){
    Etude9 frame = new Etude9();
    frame.setSize(1200, 1200);
    frame.setVisible(true);
  }
  
  public void paint(Graphics g){
    double x = 0.0;
    double y = 0.0;
    double shiftx = 300;
    double shifty = 250;
    Queue q = new Queue();
    Point draw;
    int depth = 0;
    q.enqueue(new Point(0,0));
    for(int i = 0; i < 100000; i++){
      draw = q.dequeue();
      g.fillRect((int) ((scale * draw.getX())+shiftx), (int) ((scale * draw.getY())+shifty), 1,1);
      //System.out.println(draw.getX()+ " " + draw.getY());
      q.enqueue(func1(draw.getX(), draw.getY()));
      q.enqueue(func2(draw.getX(), draw.getY()));
      q.enqueue(func3(draw.getX(), draw.getY()));   
    }

  }
  
  public static Point func1(double x, double y){
    Point p = new Point();
    p.setLocation(-0.25* x + 0.25 * Math.sqrt(3) * y + 0.25, -0.25*Math.sqrt(3) * x - 0.25 * y + 0.25 * Math.sqrt(3));
    return p;
  }
  
  public static Point func2(double x, double y){
    Point p = new Point();
    p.setLocation(0.50*x + 0.25, 0.50 * y + 0.25 * Math.sqrt(3));
    return p;
  }
  
  public static Point func3(double x, double y){
    Point p = new Point();
    p.setLocation(-0.25* x - 0.25 * Math.sqrt(3) * y + 1,  (0.25*Math.sqrt(3) * x - 0.25 * y));
    return p;
  }
}