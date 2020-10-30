public class Tester{
  public static void main (String[] args){

    Point A = new Point(0, 0);
    Point B = new Point(6, 0);
    Point C = new Point(0, -5);
    Point D = new Point(-3, 4);
    Point E = new Point(-3, 4);
    Point F = new Point(-3, 0);
    Point G = new Point(3, Math.sqrt(27));

    System.out.println(A.distanceTo(B));  //6.0
    System.out.println(A.distanceTo(C));  //5.0
    System.out.println(A.distanceTo(D));  //5.0
    System.out.println(B.distanceTo(C));  //7.81025...
    System.out.println(B.distanceTo(D));  //9.848858...
    System.out.println(C.distanceTo(D));  //9.486833...
    System.out.println(A.distanceTo(G));
    System.out.println(A.equals(D));  //false
    System.out.println(B.equals(C));  //false
    System.out.println(D.equals(E));  //true

    Triangle t1 = new Triangle(A, B, C);
    Triangle t2 = new Triangle(B, C, D);
    Triangle t3 = new Triangle(A, D, F);
    Triangle t4 = new Triangle(A, B, G);
    Triangle t5 = new Triangle(A, C, D);
    System.out.println(t1.getPerimeter());  //18.81025...
    System.out.println(t2.getPerimeter());  //27.145941...
    System.out.println(t3.getPerimeter());  //12.0
    System.out.println(t1.getArea()); //15.0
    System.out.println(t2.getArea()); //34.5
    System.out.println(t3.getArea()); //6.0
    System.out.println(t1.classify());  //scalene
    System.out.println(t2.classify());  //scalene
    System.out.println(t3.classify());  //scalene
    System.out.println(t4.classify());  //equilateral
    System.out.println(t5.classify());  //isoceles
    System.out.println(t1.toString());  //v1(0.0, 0.0) v2(6.0, 0.0) v3(0.0, -5.0)
    System.out.println(t2.toString());  //v1(6.0, 0.0) v2(0.0, -5.0) v3(-3.0, 4.0)
    System.out.println(t3.toString());  //v1(0.0, 0.0) v2(-3.0, 4.0) v3(-3.0, 0.0)
    System.out.println(t4.toString());  //v1(0.0, 0.0) v2(6.0, 0.0) v3(3.0, Math.sqrt(27))
    System.out.println(t5.toString());  //v1(0.0, 0.0) v2(0.0, -5.0) v3(-3.0, 4.0)

  }
}
