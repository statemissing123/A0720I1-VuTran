package B5_Access_moderfier.Bai_Tap;

public class Circle {
    private double radius;
    private String color;

    public Circle(){
        this.radius = 1.0;
        this.color = "Red";
    }
    public Circle(double radius){
        this.radius=radius;
        this.color=color;
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
    protected double getArea(){
        return (Math.PI * Math.pow(this.getRadius(), 2));
    }
}
