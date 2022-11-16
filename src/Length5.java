public class Length5 extends Shape{


    public Length5(double length1, double length2, double length3, double length4) {
        super(length1, length2, length3, length4);
    }

    @Override
    public double getPerimeter() {
        return getLength1()+getLength2()+getLength3()+getLength4();
    }
}
