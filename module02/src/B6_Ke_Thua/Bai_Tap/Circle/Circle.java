package B6_Ke_Thua.Bai_Tap.Circle;

public class Circle {
    private double radius = 2.0;
    private String color = "Red";
    public Circle(){

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(double radius){
        return radius*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle width radius = " + getRadius()+ " ,which is subclass of" + super.toString();
    }
}
