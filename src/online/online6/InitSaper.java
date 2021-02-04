package online.online6;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class InitSaper {
    public static char[][] createField() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько строк хотите ?");
        int rows = scanner.nextInt();
        System.out.println("Введите количество строк в игре");
        int sols = scanner.nextInt();
        char[][] field = new char[rows][sols];
        return field;
    }

    public static String getYourLvl() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите уровень сложности");
        System.out.println("Введите сложность \"Слабый\" \"Средний\" Сложный\" ");
        String lvl = scanner.next();
        return lvl;

    }

    public static void printGameField(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.println();

            }
            System.out.println();
        }

    }

    public static char[][] FieldMines(char[][] field, String lvl) {
        int mines = 0;
        if (lvl.equalsIgnoreCase("Слабый")) {
            mines = field.length * field[0].length / 10;

        } else if (lvl.equalsIgnoreCase("Средний")) {
            mines = field.length * field[0].length / 5;


        } else {
            mines = (field.length * field[0].length) / 100 * 30;

        }
        for (int i = 0; i < mines; i++) {
            addMine(field);
        }
        return field;
    }
    private static void addMine(char[][] field) {
        int randomRow = ThreadLocalRandom.current().nextInt(0, field.length);
        int randomCol = ThreadLocalRandom.current().nextInt(0, field[0].length);
        if (field[randomRow][randomCol] != '*') {
            field[randomRow][randomCol] = '*';
        } else {
            addMine(field);

        }

    }
}
