package synthesizer;
import org.junit.Test;
import static org.junit.Assert.*;

/** Tests the ArrayRingBuffer class.
 *  @author Josh Hug
 */

public class TestArrayRingBuffer {
    @Test
    public void someTest() {
        BoundedQueue x = new ArrayRingBuffer(4);
        x.enqueue(33.1); // 33.1 null null  null
        x.enqueue(44.8); // 33.1 44.8 null  null
        x.enqueue(62.3); // 33.1 44.8 62.3  null
        x.enqueue(-3.4); // 33.1 44.8 62.3 -3.4
        assertEquals(x.dequeue(), 33.1);   // 44.8 62.3 -3.4  null (returns 33.1)
        x.enqueue(33.1);
        assertEquals(x.peek(), 44.8);
    }

    @Test
    public void iteratorTest() {
        BoundedQueue<Double> x = new ArrayRingBuffer<Double>(4);
        x.enqueue(33.1); // 33.1 null null  null
        x.enqueue(44.8); // 33.1 44.8 null  null
        x.enqueue(62.3); // 33.1 44.8 62.3  null
        x.enqueue(-3.4); // 33.1 44.8 62.3 -3.4
        for (double i : x){
            System.out.println(i);
        }
    }
}
