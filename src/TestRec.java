
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

    @Test
    public void testSetRectangleWidth() {
        rectangle.setWidth(25);
        assertEquals(25, rectangle.getWidth(),0);
    }

    @Test
    public void testSetRectangleHeight() {
        rectangle.setHeight(20);
        assertEquals(20, rectangle.getHeight(),0);
    }

@Test
public void areaTestingAfterSizeChanges() {
    System.out.print(" the initial area computed : ");
    assertEquals(50, rectangle.computeArea(), 0);
    rectangle.setHeight(30);
    
    System.out.print("after changes :");
    assertEquals(150, rectangle.computeArea(), 0);
}



}