package service;

public class CurrencyConverterImpl implements CurrencyConverter{

    @Override
    public double calculate(long usd, double rate) {
        return usd * rate;
    }
}
