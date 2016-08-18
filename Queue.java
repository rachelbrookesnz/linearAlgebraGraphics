/** class to choose which block we should try to add to first
  */

public class Queue{
  
  private Node first, last;
  
  /** single node class */
  private static class Node{ 
    private Point p;
    private Node next;
    
    
    public Node(Point p){
      this.p = p;
    }
    

  }
  
  
  public Queue(){
    
  }
  
  public void printQueue(){
    Node temp = first;
    while(temp != null){
      System.out.println(temp.p);
      temp = temp.next;
    }
  }

  
  /** adds a point to the priority queue */
  public void enqueue(Point p){
    Node n = new Node(p);
    if(first == null){
      first = n;
      last = n;
    } else {
      last.next = n;
      last = n;
    }      
  } 
  
  public boolean isPresent(Point point){
    Node n = first;
    while(n != null){
      if(n.p.equals(point)){
        return true;
      }
    }
    return false;
  }
  
  /** returns the next value on the priority queue */
  public Point dequeue(){
    if(first != null){
      Node temp = first;
      first = first.next;
      return temp.p;    
    } else {
      return null;
    }
  }
  
}