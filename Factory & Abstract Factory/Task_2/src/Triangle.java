public class Triangle implements Shape {
    private double len1;
    private double len2;
    private double len3;

    public double getLen1() {
        return len1;
    }

    public void setLen1(double len1) {
        this.len1 = len1;
    }

    public double getLen2() {
        return len2;
    }

    public void setLen2(double len2) {
        this.len2 = len2;
    }

    public double getLen3() {
        return len3;
    }

    public void setLen3(double len3) {
        this.len3 = len3;
    }

    @Override
    public double Area(double l1, double l2,double l3) {
        len1 = l1;
        len2 = l2;
        len3 = l3;
        double temp = (len1+len2+len3)/2;
        return Math.sqrt(temp * (temp - len1) * (temp - len2) * (temp - len3));
    }

    @Override
    public double Perimeter(double l1, double l2, double l3) {
        len1 = l1;
        len2 = l2;
        len3 = l3;
        return len1+len2+len3;
    }


}

