package Ss08_AbstractClass_and_interface.exercise.Interface_Resizeable;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.resize(20);
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
    }
}
