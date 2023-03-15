package Ss06_Inheritance.exercise.Class_2D_And_3D;

public class Class3D extends Class2D {
    private float z;

    public Class3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Class3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        super.setXY(x,y);
        this.z = z;
    }
    public float[] getXYZ(){
        return new float[] {this.getX(),this.getY(),z};
    }

    @Override
    public String toString() {
        return "Class3D{" + getX() + getY()+
                  z +
                '}';
    }
}
