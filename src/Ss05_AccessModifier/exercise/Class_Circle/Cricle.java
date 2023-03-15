package Ss05_AccessModifier.exercise.Class_Circle;

public class Cricle {
    private double radius = 1;
    private String color = "red";

    protected double getRadius() {
        return radius;
    }

    protected double getArea() {
        return Math.PI*Math.PI*this.radius;
    }

    public Cricle() {
    }

    public Cricle(double radius) {
        this.radius = radius;
    }
}
