public class Circle implements Shape {
    private double radius = 0;
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double Area(double l1, double l2,double l3) {
        radius = l1;
        return 3.1416*radius*radius;
    }
    @Override
    public double Perimeter(double l1, double l2, double l3) {
        radius = l1;
        return 2*3.1416*radius;
    }
}
