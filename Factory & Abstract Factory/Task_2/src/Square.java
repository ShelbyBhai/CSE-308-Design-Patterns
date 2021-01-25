public class Square implements Shape {
    private double len;

    public double getLen() {
        return len;
    }

    public void setLen(double len) {
        this.len = len;
    }

    @Override
    public double Area(double l1, double l2, double l3) {
        len = l1;
        return len*len;
    }

    @Override
    public double Perimeter(double l1, double l2, double l3) {
        len = l1;
        return 4*len;
    }
}
