package online.online5;

public class Main3 {
    public static void main(String[] args) {
        int[][] num = new int[5][5];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (j > i)
                    System.out.print(num[i][j] + " ");
                else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
}