package Ss04_Class_And_OOP.exercise.Class_quadraticequation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double getDiscriminant(double a, double b, double c){
        return b*b - 4*a*c;
    }
    public  double getRoot1(double a, double b, double c){
        if (getDiscriminant(a,b,c)>=0){
            return (-b +Math.sqrt(getDiscriminant(a,b,c)))/(2*a);
        }
        return 0;
    }
    public  double getRoot2(double a, double b, double c){
        if (getDiscriminant(a,b,c)>=0){
            return (b + Math.sqrt(getDiscriminant(a,b,c)))/(2*a);
        }
        return 0;
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public QuadraticEquation() {
    }
}
