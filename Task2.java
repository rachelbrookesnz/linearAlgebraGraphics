import java.awt.*;
import javax.swing.*;


public class Task2 extends JFrame{
  
  private static int scale = 70;
  
  public static void main(String[] args){
    Task2 frame = new Task2();
    frame.setSize(1200, 1200);
    frame.setVisible(true);
  }
  
  public void paint(Graphics g){
    double x = 0.0;
    double y = 0.0;
    double shiftx = 300;
    double shifty = 0;
    Queue q = new Queue();
    Point draw;
    int depth = 0;
    q.enqueue(new Point(0,0));
    for(int i = 0; i < 500000; i++){
      draw = q.dequeue();
      g.fillRect((int) ((scale * draw.getX())+shiftx), (int) ((scale * draw.getY())+shifty), 1,1);
      q.enqueue(func1(draw.getX(), draw.getY()));
      q.enqueue(func2(draw.getX(), draw.getY()));
      q.enqueue(func3(draw.getX(), draw.getY()));  
      q.enqueue(func4(draw.getX(), draw.getY())); 
    }

  }
  
  public static Point func1(double x, double y){
    Point p = new Point();
    p.setLocation(0, 0.16*y);
    return p;
  }
  
  public static Point func2(double x, double y){
    Point p = new Point();
    p.setLocation(0.85*x + 0.04*y, -0.04*x+0.85*y+1.6);
    return p;
  }
  
  public static Point func3(double x, double y){
    Point p = new Point();
    p.setLocation(0.2*x - 0.26*y, 0.23*x + 0.22*y + 1.6);
    return p;
  }
  
  public static Point func4(double x, double y){
    Point p = new Point();
    p.setLocation(-0.15*x+0.28*y, 0.26*x+0.24*y+0.44);
    return p;
  }
}