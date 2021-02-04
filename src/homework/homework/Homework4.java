package homework.homework;
import java.util.Scanner;
public class Homework4 {


    public static void main(String[] args) {
        String text = "i'm fine and everything goes well";

        //1st task
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i'
                    || text.charAt(i) == 'o' || text.charAt(i) == 'u') {
                System.out.print(text.charAt(i) + ", ");
            }
        }

        //2nd
        int srv = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i'
                    || text.charAt(i) == 'o' || text.charAt(i) == 'u') {
                srv++;
            }
        }
        System.out.println(srv);

        //3rd
        StringBuilder reverse = new StringBuilder();
        reverse.append(text);
        String result = reverse.reverse().toString();
        System.out.println(result);

        //4th
        String newText = text.replaceAll( "[aeiou]", "?" );
        System.out.println(newText);
    }
}