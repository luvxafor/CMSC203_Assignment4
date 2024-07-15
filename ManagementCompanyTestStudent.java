
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ManagementCompanyTestStudent {
    private ManagementCompany mgmtCompany;
    private Property property1;
    private Property property2;
    private Property property3;
    private Property property4;
    private Property property5;
    private Property property6;

    @BeforeEach
    public void setUp() {
        property1 = new Property("Property1", "City1", 1000.0, "Owner1");
        property2 = new Property("Property2", "City2", 2000.0, "Owner2", 1, 1, 1, 1);
        property3 = new Property("Property3", "City3", 1500.0, "Owner3", 2, 2, 2, 2);
        property4 = new Property("Property4", "City4", 2500.0, "Owner4", 4, 4, 3, 3);
        property5 = new Property("Property5", "City5", 3000.0, "Owner5", 7, 7, 1, 1);
        property6 = new Property("Property6", "City6", 3500.0, "Owner6", 5, 5, 2, 2);
    }

    @Test
    public void testAddProperty() {
    	mgmtCompany = new ManagementCompany("MyCompany", "123456", 10);
        assertEquals(0, mgmtCompany.addProperty(property1));
        assertEquals(1, mgmtCompany.addProperty(property2));
        assertEquals(2, mgmtCompany.addProperty(property3));
        assertEquals(3, mgmtCompany.addProperty(property4));
        assertEquals(4, mgmtCompany.addProperty(property5));
        assertEquals(-1, mgmtCompany.addProperty(property6)); // Should fail as it exceeds the maximum number of properties
    }

    @Test
    public void testGetTotalRent() {
    	mgmtCompany = new ManagementCompany("MyCompany", "123456", 10);
        mgmtCompany.addProperty(property1);
        mgmtCompany.addProperty(property2);
        mgmtCompany.addProperty(property3);
        assertEquals(4500.0, mgmtCompany.getTotalRent());
    }

    @Test
    public void testHighestRentProp() {
    	mgmtCompany = new ManagementCompany("MyCompany", "123456", 10);
        mgmtCompany.addProperty(property1);
        mgmtCompany.addProperty(property2);
        mgmtCompany.addProperty(property3);
        System.out.println(mgmtCompany.getHighestRentPropperty());
        assertEquals(2000.0, mgmtCompany.getHighestRentPropperty().getRentAmount());
    }

    @Test
    public void testToString() {
    	mgmtCompany = new ManagementCompany("MyCompany", "123456", 10);
        mgmtCompany.addProperty(property1);
        mgmtCompany.addProperty(property2);
        mgmtCompany.addProperty(property3);
        String expectedString = "List of the properties for MyCompany, taxID: 123456\n"
                                + "______________________________________________________\n"
                                + "Property1,City1,Owner1,1000.0\n"
                                + "Property2,City2,Owner2,2000.0\n"
                                + "Property3,City3,Owner3,1500.0\n"
                                + "______________________________________________________\n\n"
                                + "total management Fee: 450.0";
        assertEquals(expectedString, mgmtCompany.toString().trim());
    }
}
