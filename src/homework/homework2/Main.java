package homework.homework2;

public class Main {
    public static void main(String[] args) {
Circle krug = new Circle(6);
Triangle triangle = new Triangle(3,5);
        System.out.println(triangle.perimetr());
        System.out.println(triangle.ploshad());

        System.out.println(krug.getR());

        System.out.println(krug.areaOfCircle());
    }
}
