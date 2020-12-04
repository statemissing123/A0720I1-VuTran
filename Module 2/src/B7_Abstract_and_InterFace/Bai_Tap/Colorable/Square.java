package B7_Abstract_and_InterFace.Bai_Tap.Colorable;

import B7_Abstract_and_InterFace.Bai_Tap.Resizeable.Figure.Circle;
import B7_Abstract_and_InterFace.Bai_Tap.Resizeable.Figure.Rectangle;
import B7_Abstract_and_InterFace.Bai_Tap.Resizeable.Figure.Shape;

public class Square extends Rectangle implements Colorable{
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public String toString() {
        return "A Square with side: "
                + getSide()
                + ", which is a subclass of "
                + super.toString() + ", Area: "+ getArea();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides: " + getColor());
    }

    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Shape(4,"green",true);
        shapes[1] = new Shape(5,6,"yellow",true);
        shapes[2] = new Circle(7,"blue",true);
        for (Shape shape: shapes) {
            System.out.println(shape);
            if (shape instanceof Colorable){
                Colorable colorable = (Colorable) shape;
                colorable.howToColor();
            }
        }
    }
}
