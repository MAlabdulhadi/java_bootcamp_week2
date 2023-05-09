



public class Main {
    public static void main(String[] args) {

        //test shape
        Shape sh = new Shape("green",true);
        System.out.println(sh.getColor());
        System.out.println(sh.isFilled());


        // test circle

        System.out.println("_________________");

        Circle c = new Circle(3,"green",true);
        System.out.println("the area = "+c.getArea());
        System.out.println("the perimeter = "+c.getPerimeter());

        System.out.println("____________");

        // test Rectangle
        Rectangle r = new Rectangle(2,3,"blue",true);
        System.out.println("the area = "+r.getArea());
        System.out.println("the perimeter = "+r.getPerimeter());

        // test Square

        System.out.println("______________________");

        Square s = new Square(2,"yello",false);
        System.out.println("the area = "+s.getArea());
        System.out.println("the perimeter = "+s.getPerimeter());





    }
}