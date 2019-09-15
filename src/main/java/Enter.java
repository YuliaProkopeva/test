public class Enter {


    public static void main(String[] args) {

        Point p1 = new Point();
        Point p2 = new Point();

        p1.m = 12;
        p1.n = 15;
        p2.m = 19;
        p2.n = 11;

    System.out.println(Point.distance(p1, p2));

    }

}
