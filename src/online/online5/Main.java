package online.online5;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int day = 0; day <366; day++) {
            for (int hour = 0; hour <24 ; hour++) {
                for (int min = 0; min < 60; min++) {
                    for (int sec = 0; sec < 60; sec++) {
                        Thread.sleep(1000);
                        System.out.printf("От старта прошло %d дня,%d часа,%d минут,%d секунд \n",day,hour,min,sec);

                    }

                }
                
            }
            
        }
    }

}
