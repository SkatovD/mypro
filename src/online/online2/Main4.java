package online.online2;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ВВедите пароль");
        boolean bool = true;
        int lower = 0, upper = 0, digits = 0;
        boolean bLow = false, bUpp = false, bDigit = false;

        while (bool) {
            String password = scanner.nextLine();
            char[] array = password.toCharArray();
            if (password.length() < 8) {
                System.out.println("Пароль должен содержать больше 8 символов");

            }
            for (int i = 0; i < array.length; i++) {
                if (Character.isDigit(array[i]))
                    digits++;
                if (Character.isLowerCase(array[i]))
                    lower++;
                if (Character.isUpperCase(array[i]))
                    upper++;
            }
            if (!(lower > 0)) {
                bLow = false;
                System.out.println("Нет прописной буквы!");
            } else {
                bLow = true;
            }
            if (!(upper > 0)) {
                System.out.println("Нет Заглавной буквы!");
                bUpp = false;
            } else {
                bUpp = true;
            }
            if (!(digits > 0)) {
                System.out.println("Нет цифр!");
                bDigit = false;
            } else {
                bDigit = true;
            }
            if (bLow && bUpp && bDigit == true) {
                bool = false;
            }
        }
    }
}

