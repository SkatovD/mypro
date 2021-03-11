package online11;

import java.util.ArrayList;
import java.util.Map;
import java.util.SplittableRandom;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> texts = new ArrayList<>();
        texts.add("a");
        texts.add("b");
        texts.add("s");
        texts.add("d");
        texts.add("f");
        texts.add(0,"!!!!");
        texts.set(1,"Lox");
        //texts.sort(); сортировка по
        System.out.println(texts.get(0));// достать по позиции
        System.out.println(texts.contains("!!!!")); // contains есть ли такой объект
        System.out.println(texts.size());
        System.out.println(texts);
        System.out.println(texts.remove(0)); // после печати удалит по индексу

    }
}
