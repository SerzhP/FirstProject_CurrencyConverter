

import coins.Coin;
import enums.CoinsEnum;
import factory.CoinsFactory;
import results.Results;
import screens.InterfaceScreens;

import java.util.ArrayList;


// Main class demonstrating the currency converter process.

public class Main {
    public static void main(String[] args) {
        InterfaceScreens user = new InterfaceScreens();
        ArrayList<String> resultsList = new ArrayList<>();
        Coin value = null;
        Results userResults;

        // Display welcome message
        user.welcome();

        do {
            // Handle user choice
            switch (user.chooseOptions()) {

                case 1:
                    value = CoinsFactory.getCoinChoice(CoinsEnum.USD);
                    break;
                case 2:
                    value = CoinsFactory.getCoinChoice(CoinsEnum.ILS);
                    break;

            }

            // Perform the calculation
            double result = value.calculate(user.amountToConvert());
            String currency = value.conversionText();

            // Save and display the result
            userResults = new Results(result, currency);
            resultsList.add(userResults.resultScreen());
            System.out.println(userResults.resultScreen());
        } while (user.askToRestart());

        // Display end screen
        user.endScreen(resultsList);
    }
}


