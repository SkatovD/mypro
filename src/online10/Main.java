package online10;

public class Main {
    public static void main(String[] args) {
     FarctionNumberImpl dro1 = new FarctionNumberImpl(1,5);
        FarctionNumberImpl dro2 = new FarctionNumberImpl(2,3);
       double result= dro1.value();
        System.out.println(result);
        System.out.println(dro1.toString());
        ColculatorDroby colculator = new ColculatorDroby();
        FractionNumber resultAdd= colculator.add(dro1,dro2);
        System.out.println(resultAdd);


    }
}
