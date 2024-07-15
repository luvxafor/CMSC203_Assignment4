
public class Property {
    private String propertyName;
    private String city;
    private double rentAmount;
    private String owner;
    private Plot plot;

    // Default constructor
    public Property() {
        this("", "", 0.0, "");
    }

    // Parameterized constructor
    public Property(String propertyName, String city, double rentAmount, String owner) {
        this.propertyName = propertyName;
        this.city = city;
        this.rentAmount = rentAmount;
        this.owner = owner;
        this.plot = new Plot(); // Default plot
    }

    // Parameterized constructor with plot details
    public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth) {
        this.propertyName = propertyName;
        this.city = city;
        this.rentAmount = rentAmount;
        this.owner = owner;
        this.plot = new Plot(x, y, width, depth);
    }

    // Copy constructor
    public Property(Property otherProperty) {
        this(otherProperty.propertyName, otherProperty.city, otherProperty.rentAmount, otherProperty.owner, otherProperty.plot.getX(), otherProperty.plot.getY(), otherProperty.plot.getWidth(), otherProperty.plot.getDepth());
    }

    // Getters
    public String getPropertyName() {
        return propertyName;
    }

    public String getCity() {
        return city;
    }

    public double getRentAmount() {
        return rentAmount;
    }

    public String getOwner() {
        return owner;
    }

    public Plot getPlot() {
        return plot;
    }

    // Setters
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setPlot(Plot plot) {
        this.plot = plot;
    }

    // Convert the property to string
    @Override
    public String toString() {
        return propertyName + "," + city + "," + owner + "," + rentAmount;
    }

    public static void main(String[] args) {
        // Testing the Property class
        Property propertyOne = new Property("Property ABC", "Rockville", 2450.00, "Wells Fargo Bank");
        System.out.println("Property One: " + propertyOne);
    }
}

