package factory;
import coins.Coin;
import coins.ILS;
import coins.USD;
import enums.CoinsEnum;

//Factory to create instances of Coin based on the user's choice

public class CoinsFactory {
    public static Coin getCoinChoice(CoinsEnum coin) {
        switch (coin) {
            case USD:
                return new USD();
            case ILS:
                return new ILS();
            default:
                throw new IllegalArgumentException("Invalid coin type");
        }
    }
}
