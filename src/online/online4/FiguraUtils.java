package online.online4;

public class FiguraUtils {
    public static double squareOfTriangle(int a,int b,int c){
      int per = (a+b+c)/2;
      double square = Math.sqrt (per*(per-a)*(per-b)*(per-c));
      return square;

    }
}
