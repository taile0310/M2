package ss4.bai_tap;

public class QuadraticEquation {
    public int a;
    public int b;
    public int c;

    public QuadraticEquation(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double getDiscriminant(){
        return (Math.pow(this.b,2) - (4 * this.a * this.c));
    }

    public double root1(){
        return (-this.b + Math.sqrt(Math.pow(this.b,2) - 4 * this.a * this.c)) / (2 * a);
    }

    public double root2(){
        return (-this.b - Math.sqrt(Math.pow(this.b,2) - 4 * this.a * this.c)) / (2 * a);
    }
}
