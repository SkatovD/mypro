package online.online4;

public class StringUtils {
    /*
    1- Модификатор доступа (это одно из 4 слов)
    public- доступ в любом месте внутри кода
    protected- в нутри пакета,в нутри текущего файла и его наследники
    если ничего не поставим(package) в нутри пакет
    private - внутри текущего файла
    2- static (может быть а может не быть)
    3- возвращаемый тип (if string char или void если ничего нет )
    4- название метода С МАЛЕНЬКОЙ БУКВЫ
    5- входяшие параметры могут быть(int a int b) а могут и не быть но () всегда нужны.
    6- тело выполнения данного метода
     */

    public static void printRevers(String textToReverse) {
        //TE
        for (int i = textToReverse.length() - 1; i >= 0; i--) {
            System.out.print(textToReverse.charAt(i));

        }
        System.out.println();
    }

    public static void printTextByWord(String text) {
        String[] sl = text.split("'");
        for (int i = 0; i < sl.length; i++) {
            System.out.println(sl[i]);

        }

    }

    //1st task
    public static int countGlass(String text) {
        int count = 0;
        String string = text.toLowerCase();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i'
                    || string.charAt(i) == 'o' || string.charAt(i) == 'u') {
                count++;
            }
        }
        return count;

    }

    //2nd task
    public static void biggestDigith(int a, int b, int c) {
        if (a > b && a > c)
            System.out.println(a + "");
        else if (b > a && b > c)
            System.out.println(b + "");
        else if (c > a && c > b)
            System.out.println(c + "");
        else
            System.out.println("Одно из чисел равно другому ");
    }

    public static int amountOfWord(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ')
                count++;
        }

        return ++count;
    }

}



