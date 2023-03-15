package Ss08_AbstractClass_and_interface.exercise.Colorable;

public class Square extends Shape {
    private double edge;

    public Square() {
    }

    public Square(String color, boolean filled, double edge) {
        super(color, filled);
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }
    public double getArea() {
        return edge*edge;
    }
    public double getPerimeter() {
        return edge*4;
    }
    @Override
    public void howToColor() {
        super.howToColor();
        System.out.println("Color all four sides");
    }

    @Override
    public String toString() {
        return "A Square with area="
                + getEdge()
                + ", which is a subclass of "
                + super.toString();
    }
}
