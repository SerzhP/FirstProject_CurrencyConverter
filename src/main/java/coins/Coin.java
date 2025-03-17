package coins;

import interfaces.ICalculate;

//Abstract class representing a coin and its value

public abstract class Coin implements ICalculate {
    public abstract double getValue();
    public abstract String conversionText();// Returns a string describing the direction of the currency conversion
}