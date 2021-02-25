package homework.homework2;

public class Circle {
    double r;


    public Circle(int r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public double areaOfCircle(){
        double s = Math.PI * r;
        return s;
    }

    public double perimetrOfCircle(){
        double p = Math.PI*(r*r);
        return p;
    }
}
