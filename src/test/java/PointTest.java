import org.testng.annotations.Test;

public class PointTest {

    @Test
    public void areatest() {

        Point p1 = new Point();
        Point p2 = new Point();

        p1.m = 12;
        p1.n = 15;
        p2.m = 19;
        p2.n = 11;

        assert Point.distance(p1, p2) == 8.06225774829855;
    }
}
