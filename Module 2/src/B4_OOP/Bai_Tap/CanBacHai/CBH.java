package B4_OOP.Bai_Tap.CanBacHai;

public class CBH {
    private double a, b, c;

    public CBH() {

    }

    public CBH(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double getDiscriminant() {
        double delta = Math.pow(b, 2) - (4 * a * c);
        return delta;
    }

    public double getRoot1() {
        if (getDiscriminant() >= 0) {
            double r1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
            return r1;
        } else {
            return 0;
        }
    }

    public double getRoot2() {
        if (getDiscriminant() >= 0) {
            double r2 = (-b - Math.sqrt(getDiscriminant())) / (2 * a);
            return r2;
        } else {
            return 0;
        }
    }

    public String getRoot3() {
        if (getDiscriminant() < 0) {
            return "Phương trình vô nghiệm";
        }
        return "";
    }
//    public double getRoot4(){
//        if (getDiscriminant()==0){
//            double r = -b/(2*a);
//            return r;
//        }
//    }


}
