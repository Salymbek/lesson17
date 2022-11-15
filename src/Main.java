public class Main {
    public static void main(String[] args) {

        Shape length1 = new Length1(5,4,5,10);
        length1.getPerimeter();
        System.out.println(length1);


        Shape length2 = new Length2(1,8,5,15);
        length2.getPerimeter();
        System.out.println(length2);


        Shape length3 = new Length3(2,4,6,8);
        length3.getPerimeter();
        System.out.println(length3);


        Shape length4 = new Length4(3,5,7,9);
        length4.getPerimeter();
        System.out.println(length4);


        Shape length5 = new Length5(11,3,5,10);
        length5.getPerimeter();
        System.out.println(length5);





    }
}