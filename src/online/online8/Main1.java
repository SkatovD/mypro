package online.online8;

public class Main1 {
    public static void main(String[] args) {
        Treugol figure = new Treugol();
        figure.setA(3);
        figure.setB(4);
        figure.setC(4   );
        int perimetrFigure = figure.per();

        Treugol figure1 = new Treugol(3,3,5);
int perimetr = figure1.per();
        System.out.println(perimetr);
        System.out.println(perimetrFigure);
    }

}
