public class Rectangle implements Shape {
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double Area(double l1, double l2, double l3) {
        length = l1;
        width = l2;
        return length*width;
    }

    @Override
    public double Perimeter(double l1, double l2, double l3) {
        length = l1;
        width = l2;
        return 2*(length+width);
    }
}
