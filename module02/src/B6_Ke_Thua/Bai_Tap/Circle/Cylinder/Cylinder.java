package B6_Ke_Thua.Bai_Tap.Circle.Cylinder;

import B6_Ke_Thua.Bai_Tap.Circle.Circle;

public class Cylinder extends Circle {
    private double height = 5.0;

    public Cylinder(){

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return 2*Math.PI*getRadius()*getHeight();
    }

    @Override
    public String toString() {
        return "A Cylinder height is =" +getHeight()+ "lop con"+
                super.toString();
    }
}
