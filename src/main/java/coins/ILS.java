package coins;

//ILS coin class representing Shekels
public class ILS extends Coin {
    private final double value = 0.28; // 1 ILS = 0.28 USD

    @Override
    public double getValue() {
        return value;
    }

    @Override
    public double calculate(double amount) {
        return amount * getValue(); //Converts ILS to USD
    }

    @Override
    public String conversionText() {
        return "ILS to USD";
    }
}