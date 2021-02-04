package online.online5;

public class Main2 {
    public static void main(String[] args) {
        int[][] num = {
                {2, 5, 7, 2, 2},
                 {5, 2, 1, 5},
                 {5, 5, 7}};
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j]+ " ");
                
            }
            System.out.println();
        }

    }
}
