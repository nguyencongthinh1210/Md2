package Ss06_Inheritance.exercise.Class_2D_And_3D;

public class Class2D {
    private float x;
    private float y;

    public Class2D() {
    }

    public Class2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void  setXY(float x, float y){
        this.x=x;
        this.y=y;
    }
    public float[] getXY(){
        return new float[] {x,y};
    }

    @Override
    public String toString() {
        return "{"+ x + "," + y +"}";
    }
}
