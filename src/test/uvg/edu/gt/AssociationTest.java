package uvg.edu.gt;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AssociationTest {
    @Test
    public void testAssociationCreation() {
        Association<String, Integer> association = new Association<>("key", 5);
        assertEquals("key", association.getKey());
        assertEquals(5, (int)association.getData());
    }

    @Test
    public void testAssociationComparison() {
        Association<String, Integer> association1 = new Association<>("apple", 1);
        Association<String, Integer> association2 = new Association<>("banana", 2);
        Association<String, Integer> association3 = new Association<>("apple", 3);

        assertEquals(-1, association1.compareTo(association2));
        assertEquals(1, association2.compareTo(association1));
        assertEquals(0, association1.compareTo(association3));
    }
}