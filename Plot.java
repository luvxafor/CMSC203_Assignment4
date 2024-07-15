
public class Plot {
    private int x;
    private int y;
    private int width;
    private int depth;

    // Default constructor
    public Plot() {
        this(0, 0, 1, 1);
    }

    // Parameterized constructor
    public Plot(int x, int y, int width, int depth) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.depth = depth;
    }

    // Copy constructor
    public Plot(Plot otherPlot) {
        this(otherPlot.x, otherPlot.y, otherPlot.width, otherPlot.depth);
    }

    // Getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getDepth() {
        return depth;
    }

    // Setters
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    // Check if this plot encompasses another plot
    public boolean encompasses(Plot plot) {
        return (plot.getX() >= this.x) &&
               (plot.getY() >= this.y) &&
               (plot.getX() + plot.getWidth() <= this.x + this.width) &&
               (plot.getY() + plot.getDepth() <= this.y + this.depth);
    }

    // Check if this plot overlaps with another plot
    public boolean overlaps(Plot plot) {
        return !(plot.getX() + plot.getWidth() <= this.x || 
                 plot.getX() >= this.x + this.width || 
                 plot.getY() + plot.getDepth() <= this.y || 
                 plot.getY() >= this.y + this.depth);
    }

    // Convert the plot to string
    @Override
    public String toString() {
        return x + "," + y + "," + width + "," + depth;
    }

    public static void main(String[] args) {
        // Testing the Plot class
        Plot plot1 = new Plot(2, 2, 6, 6);
        Plot plot5 = new Plot(3, 4, 4, 3);
        
        System.out.println("Plot 1: " + plot1);
        System.out.println("Plot 5: " + plot5);
        
        System.out.println("Does Plot 1 encompass Plot 5? " + plot1.encompasses(plot5));
        System.out.println("Does Plot 1 overlap Plot 5? " + plot1.overlaps(plot5));
    }
}
