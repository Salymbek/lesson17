public class Main {
    public static void main(String[] args) {

        Shape length1 = new Length1(5,4,5,10);
        System.out.println(length1);
        System.out.println("PERIMETR = " + length1.getPerimeter());


        Shape length2 = new Length2(1,8,5,15);
        System.out.println(length2);
        System.out.println("PERIMETR = " + length2.getPerimeter());


        Shape length3 = new Length3(2,4,6,8);
        System.out.println(length3);
        System.out.println("PERIMETR = " + length3.getPerimeter());


        Shape length4 = new Length4(3,5,7,9);
        System.out.println(length4);
        System.out.println("PERIMETR = " + length4.getPerimeter());


        Shape length5 = new Length5(11,3,5,10);
        System.out.println(length5);
        System.out.println("PERIMETR = " + length5.getPerimeter());


    }
}