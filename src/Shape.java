public abstract class Shape {

    private double length1;
    private double length2;
    private double length3;
    private double length4;

    public double getLength1() {
        return length1;
    }

    public void setLength1() {
        this.length1 = length1;
    }

    public double getLength2() {
        return length2;
    }

    public void setLength2(double length2) {
        this.length2 = length2;
    }

    public double getLength3() {
        return length3;
    }

    public void setLength3(double length3) {
        this.length3 = length3;
    }

    public double getLength4() {
        return length4;
    }

    public void setLength4(double length4) {
        this.length4 = length4;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "length1=" + length1 +
                ", length2=" + length2 +
                ", length3=" + length3 +
                ", length4=" + length4 +
                '}';
    }

    public Shape(double length1, double length2, double length3, double length4) {
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;
        this.length4 = length4;
    }

    public abstract double getPerimeter();

}
