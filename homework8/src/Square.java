public class Square extends Rectangle{


    public Square() {

    }


    public Square(double side) {
        super(side, side);
    }

    public Square(double side,String color, boolean filled) {
        super(side, side, color, filled);

    }

    public double getSide(){
        return getWidth();
    }

    public void setSide(double side){
        setLength(side);
        setWidth(side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side = " + getSide()+
                " color = "+ getColor()+
                " isFiled = "+isFilled()+
                " the area = +"+getArea()+
                " the perimeter = "+getPerimeter()+
                "}";
    }
}
