package bearmaps;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class PointSetTest {
    @Test
    public void startingTest() {
        Point p1 = new Point(1.1, 2.2); // constructs a Point with x = 1.1, y = 2.2
        Point p2 = new Point(3.3, 4.4);
        Point p3 = new Point(-2.9, 4.2);

        NaivePointSet nn = new NaivePointSet(List.of(p1, p2, p3));
        Point ret = nn.nearest(3.0, 4.0); // returns p2
        System.out.println(ret.getX());
        System.out.println(ret.getY());
    }

}
