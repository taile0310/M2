package ss6.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Point2D {
    public float x;
    public float y;

    public Point2D() {
    }

    public Point2D(float x, float y) {
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

    public void setXY (float x, float y){
        this.x = x;
        this.y = y;
    }

    public float[] getXY (){
        float[] arr = new float[2];
        arr[0] = x;
        arr[1] = y;
        return arr;
    }


    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    static class Point3D extends Point2D {
        public float z;

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
            arr1[0] = x;
            arr1[1] = y;
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter x,y: ");
        float x = Float.parseFloat(scanner.nextLine());
        float y = Float.parseFloat(scanner.nextLine());
        Point2D point2D = new Point2D(x, y);

        System.out.println("Point2D is: " + Arrays.toString(point2D.getXY()));

        System.out.println("enter z: ");
        float z = Float.parseFloat(scanner.nextLine());
        Point3D point3D = new Point3D(x, y, z);

        System.out.println("Point3D is: " + Arrays.toString(point3D.getZXY()));

    }


}
