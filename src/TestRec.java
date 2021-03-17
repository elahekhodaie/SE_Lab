
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRec {
    Rectangle rectangle = new Rectangle(5,10);

    @Test
    public void testGetRectangleWidth() {
        assertEquals(5, rectangle.getWidth(), 0);
    }

    @Test
    public void testGetRectangleHeight() {
        assertEquals(10, rectangle.getHeight(), 0);
    }

    @Test
    public void testRectangleComputeArea() {
        assertEquals(50, rectangle.computeArea(), 0);
    }



}