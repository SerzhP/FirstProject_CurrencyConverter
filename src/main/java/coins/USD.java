package coins;


//USD coin class representing Dollars
public class USD extends Coin {
    private final double value = 3.52; // 1 USD = 3.52 ILS

    @Override
    public double getValue() {
        return value;
    }

    @Override
    public double calculate(double amount) {
        return amount * getValue(); //Converts USD  to ILS
    }

    @Override
    public String conversionText() {
        return "USD to ILS";
    }
}