package online.online2;

public class Main2 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
            int generatorValue = 10;
        for (int i = 0; i < 11; i++) {
            numbers[i] = generatorValue;
            generatorValue =generatorValue+2;

            System.out.println(numbers[i]);

        }
    }
}
