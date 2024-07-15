
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PropertyTestStudent {
    private Property property1;
    private Property property2;

    @BeforeEach
    public void setUp() {
        property1 = new Property("Property1", "City1", 1000.0, "Owner1");
        property2 = new Property("Property2", "City2", 2000.0, "Owner2", 1, 1, 2, 2);
    }

    @Test
    public void testConstructor() {
        Property property = new Property("Property3", "City3", 3000.0, "Owner3");
        assertEquals("Property3", property.getPropertyName());
        assertEquals("City3", property.getCity());
        assertEquals(3000.0, property.getRentAmount());
        assertEquals("Owner3", property.getOwner());
    }

    @Test
    public void testConstructorWithPlot() {
        Property property = new Property("Property4", "City4", 4000.0, "Owner4", 3, 3, 3, 3);
        assertEquals("Property4", property.getPropertyName());
        assertEquals("City4", property.getCity());
        assertEquals(4000.0, property.getRentAmount());
        assertEquals("Owner4", property.getOwner());
        assertEquals(3, property.getPlot().getX());
        assertEquals(3, property.getPlot().getY());
        assertEquals(3, property.getPlot().getWidth());
        assertEquals(3, property.getPlot().getDepth());
    }

    @Test
    public void testCopyConstructor() {
        Property propertyCopy = new Property(property1);
        assertEquals(property1.getPropertyName(), propertyCopy.getPropertyName());
        assertEquals(property1.getCity(), propertyCopy.getCity());
        assertEquals(property1.getRentAmount(), propertyCopy.getRentAmount());
        assertEquals(property1.getOwner(), propertyCopy.getOwner());
    }

    @Test
    public void testToString() {
        assertEquals("Property1,City1,Owner1,1000.0", property1.toString());
    }
}
