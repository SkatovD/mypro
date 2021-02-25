package online10;

import java.util.Objects;

public class FarctionNumberImpl implements FractionNumber {
    private int divident;
    private int divisor;

    public FarctionNumberImpl(int divident, int divisor) {
        this.divident = divident;
        this.divisor = divisor;
    }

    public FarctionNumberImpl() {

    }

    @Override
    public void setDividend(int dividend) {
        this.divident = dividend;

    }

    @Override
    public int getDividend() {
        return this.divident;
    }

    @Override
    public void setDivisor(int divisor)
             {
        this.divisor = divisor;

    }

    @Override
    public int getDivisor() {
        return this.divisor;
    }

    @Override
    public double value() {

        return (double) this.divident / this.divisor;
    }

    @Override
    public String toString() {
        return this.divident + "/"+ this.divisor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FarctionNumberImpl that = (FarctionNumberImpl) o;
        return divident == that.divident && divisor == that.divisor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(divident, divisor);
    }
}
