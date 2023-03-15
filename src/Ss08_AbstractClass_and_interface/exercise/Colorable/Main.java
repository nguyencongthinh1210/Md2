package Ss08_AbstractClass_and_interface.exercise.Colorable;

public class Main {
    public static void main(String[] args) {
        Shape[] newShape = new Shape[4];
        newShape[0] = new Circle();
        newShape[1] = new Shape();
        newShape[2] = new Rectangle();
        newShape[3] = new Square();
        for (Shape x:
             newShape) {
            System.out.println(x.toString());
            if ((x instanceof Square)==true){
                x.howToColor();
            }
        }
    }
}
