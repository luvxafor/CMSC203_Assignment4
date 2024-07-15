
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlotTestStudent {
    private Plot plot1;
    private Plot plot2;

    @BeforeEach
    public void setUp() {
        plot1 = new Plot(0, 0, 1, 1);
        plot2 = new Plot(2, 2, 2, 2);
    }

    @Test
    public void testConstructor() {
        Plot plot = new Plot(1, 1, 3, 3);
        assertEquals(1, plot.getX());
        assertEquals(1, plot.getY());
        assertEquals(3, plot.getWidth());
        assertEquals(3, plot.getDepth());
    }

    @Test
    public void testCopyConstructor() {
        Plot plotCopy = new Plot(plot1);
        assertEquals(plot1.getX(), plotCopy.getX());
        assertEquals(plot1.getY(), plotCopy.getY());
        assertEquals(plot1.getWidth(), plotCopy.getWidth());
        assertEquals(plot1.getDepth(), plotCopy.getDepth());
    }

    @Test
    public void testOverlaps() {
        assertFalse(plot1.overlaps(plot2));
        assertTrue(plot1.overlaps(new Plot(0, 0, 2, 2)));
    }

    @Test
    public void testEncompasses() {
        Plot largerPlot = new Plot(0, 0, 5, 5);
        assertTrue(largerPlot.encompasses(plot1));
        assertFalse(plot1.encompasses(largerPlot));
    }

    @Test
    public void testToString() {
        assertEquals("0,0,1,1", plot1.toString());
    }
}
