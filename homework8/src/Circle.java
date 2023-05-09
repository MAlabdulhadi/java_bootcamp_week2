public class Circle extends Shape{

    private double radius = 1.0;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius,String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){

        return 3.14 * getRadius() * getRadius();
    }

    @Override
    public double getPerimeter(){

        return 2 * 3.14 * getRadius();

    }

    @Override
    public String toString() {
        return "Circle{" +
                " radius=" + radius +
                ", color = "+ getColor()+
                ", isFiled = "+isFilled()+
                ", the area = +"+getArea()+
                ", the perimeter = "+getPerimeter()+
                '}';
    }
}
