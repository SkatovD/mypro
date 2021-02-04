package online.online2;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        String text = "Im Programmer";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Привет как тебя завут");
        String input = scanner.next();
        System.out.printf("Приятно познакомиться %s \n",input);
        System.out.println("Сколько тебе лет?");
       int inputage =  scanner.nextInt();
        if (inputage <10){
            System.out.println("Ты малой ");
        } else if (inputage > 10 && inputage <20 ) {
            System.out.println("Учишься?");
        }else if (inputage >20 && inputage < 40 ){
            System.out.println("Мне столькоже почти");


            }else{
            System.out.println("Ладно я устал" );

        }


    }
}
