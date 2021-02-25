package online10;

public class ColculatorDroby implements FractionNumberOperation{
    @Override
    public FractionNumber add(FractionNumber a, FractionNumber b) throws NullPointerException {
        int resultDivisior =  a.getDivisor()* b.getDivisor();
        int resultDivident = a.getDividend()*b.getDivisor() + b.getDividend() * a.getDivisor();
        FarctionNumberImpl result = new FarctionNumberImpl();
        result.setDivisor(resultDivisior);
result.setDivisor(resultDivident);
        return null;
    }

    @Override
    public FractionNumber sub(FractionNumber a, FractionNumber b) throws NullPointerException {
        return null;
    }

    @Override
    public FractionNumber mul(FractionNumber a, FractionNumber b) throws NullPointerException {
        return null;
    }

    @Override
    public FractionNumber div(FractionNumber a, FractionNumber b) throws NullPointerException, ArithmeticException {
        return null;
    }
}
