public class Tester{
  public static void main (String[] args){
    Point A = new Point(0, 0);
    Point B = new Point(6, 0);
    Point C = new Point(0, -5);
    Point D = new Point(-3, 4);
    System.out.println(A.distanceTo(B));  //6.0
    System.out.println(A.distanceTo(C));  //5.0
    System.out.println(A.distanceTo(D));  //5.0
    System.out.println(B.distanceTo(C));  //7.81025
    System.out.println(B.distanceTo(D));  //9.848858
    System.out.println(C.distanceTo(D));  //9.486833
  }
}
