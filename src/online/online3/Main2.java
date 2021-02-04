package online.online3;

public class Main2 {
    public static void main(String[] args) {
        String email = "denis@mail.ru";
        if (!email.contains("@")) {
            System.out.println("Не так надо");
            return;
        }
        if (email.endsWith(".") || (email.startsWith("."))) {
            System.out.println("Не то ");
            return;
        }
        String[] str = email.split("@");
        if (str.length >= 3) {
            System.out.println("Нето");
            return;
        }if (str[1].contains(".")){
            System.out.println("Нето");
            return;
    }
        System.out.println("Все окей");
    }
}
