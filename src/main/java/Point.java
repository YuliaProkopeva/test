public class Point {

   int m;
   int n;

    public static double distance(Point p1, Point p2) {
      return  Math.sqrt(Math.pow((p1.m - p2.m), 2) + Math.pow((p1.n - p2.n), 2));
    }


}
