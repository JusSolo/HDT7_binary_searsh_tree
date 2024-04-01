package uvg.edu.gt;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class UVGBSTTest {
    @Test
    public void testAddAndGet() {
        UVGBST<Integer> tree = new UVGBST<>();
        tree.add(5);
        tree.add(3);
        tree.add(7);

        assertEquals((Integer)5, tree.get(5));
        assertEquals((Integer)3, tree.get(3));
        assertEquals((Integer)7, tree.get(7));

        assertNull(tree.get(10));
    }

    @Test
    public void testHeight() {
        UVGBST<Integer> tree = new UVGBST<>();
        assertEquals(-1, tree.height());

        tree.add(5);
        assertEquals(0, tree.height());

        tree.add(3);
        assertEquals(1, tree.height());

        tree.add(7);
        assertEquals(1, tree.height());

        tree.add(2);
        assertEquals(2, tree.height());

        tree.add(6);
        assertEquals(2, tree.height());

        tree.add(8);
        assertEquals(2, tree.height());
    }
}
