package B7_Abstract_and_InterFace.Bai_Tap.Resizeable.Figure;

public class RunResizeable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(4);
        shapes[1] = new Square(5,"green",true);
        shapes[2] = new Rectangle(3,4,"red",false);
        System.out.println("Before resize: ");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        System.out.println("------------------");
        for (Shape shape : shapes){
            shape.resize((Math.random()*100+1)/100  );
            System.out.println(shape);
        }
    }
}

