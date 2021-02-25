package online9;

public class ExcellentStudent extends Student {
    @Override
    public int perimetrTriangle(int sideA, int sideB, int sideC) {
        if (sideA + sideB < sideC) {
            System.out.println("Это не треугольник");
            return -1;

        }
        return sideA + sideB + sideC;
    }
}
