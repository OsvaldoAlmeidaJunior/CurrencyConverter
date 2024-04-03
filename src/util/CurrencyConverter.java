package util;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double Converter (double a, double b){
        return (a * b) + (IOF * a * b);
    }

}
