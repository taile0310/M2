package ss6.bai_tap;

public class Point3D extends Point2D {
    private float z;

    public Point3D() {
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float z){
        super.getXY();
        this.z = z;
    }

    public float[] getZXY() {
        float[] arr1 = new float[3];
        arr1[0] = super.getX();
        arr1[1] = super.getY();
        arr1[2] = z;
        return arr1;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                '}';
    }
}
