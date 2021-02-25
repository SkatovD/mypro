package online.online8;

public class Treugol {
    private int a;
    private int b;
    private int c;

    public Treugol() {

    }

    public Treugol(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Treugol(int a) {
        this.a = a;
        this.b = a;
        this.c = a;

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

    public int per() {
        return a + b + c;

    }
}
