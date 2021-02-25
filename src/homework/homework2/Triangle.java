package homework.homework2;

public class Triangle {

    double a;
    double b;

    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

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

    public double perimetr(){
        double p = 2*(a+b);
        return p;
    }

    public double ploshad(){
        double pl = a*b;
        return pl;
    }
}
