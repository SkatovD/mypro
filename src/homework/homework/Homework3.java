package homework.homework;

public class Homework3 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i =20;i<=100;i++){
            if(i%5==0 &&  i%4==0){
                sum= sum+i;

            }
        }
        System.out.println(sum);   }
}
