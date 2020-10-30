public class Point{
  private double x,y;

  //construct a point given coordinates
  public Point(double X, double Y){
    x = X;
    y = Y;
  }

  //construct a point given a point (redundant, just provide flexibility)
  public Point(Point p){
    x = p.x;  //privaate access in the same file is allowed!
    y = p.y;
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }

  public double distanceTo(Point other){
    return Math.sqrt((x - other.x) * (x - other.x) + (y - other.y) * (y - other.y));
  }

  public boolean equals(Point other){
    return other != null && x == other.x && y == other.y;
  }
}
