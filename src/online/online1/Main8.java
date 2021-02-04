package online.online1;

public class Main8 {
    public static void main(String[] args) {
        int num1 = 5 ;
        int num2 = 10;

       for(int i= 1;i<Integer.MAX_VALUE;i++){
        if (i% num1 == 0 && i% num2 == 0){
            System.out.println(i);
            break;
        }
       }
    }
}
