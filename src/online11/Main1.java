package online11;

import java.sql.Time;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        long StartTime1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
           arrayList.add("авыаfsdfыв" + i);


        }
        long EndTime1 = System.currentTimeMillis();
        System.out.println("ArrayList ADD: " + (EndTime1-StartTime1));
        long StartTime2 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.add("авыаfsdfыв" + i);


        }
        long EndTime2 = System.currentTimeMillis();
        System.out.println("LinkedList ADD: " + (EndTime1-StartTime1)); }



}
