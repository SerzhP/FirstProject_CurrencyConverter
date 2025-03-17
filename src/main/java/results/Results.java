package results;

//Class to represent and format conversion results.

public class Results {
    private final double result;
    private final String currency;

    public Results(double result, String currency) {
        this.result = result;
        this.currency = currency;
    }

    public String resultScreen() {
        return String.format("Converted amount: %.2f (%s)", result, currency);
    }
}