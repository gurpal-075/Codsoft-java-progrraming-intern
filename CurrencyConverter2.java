
import java.util.Scanner;

public class CurrencyConverter2 {

    public static void main(String[] args) {
        final double USD_TO_IND = 83.36;
        final double CAN_TO_IND = 60.97;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount in USD: ");
        double usdAmount = scanner.nextDouble();

        System.out.println("Choose a currency to convert to:");
        System.out.println("1. IND");
        System.out.println("2. IND");

        int choice = scanner.nextInt();
        double convertedAmount = 0.0;
        String currencyName = "";
        switch (choice) {
            case 1:
                convertedAmount = usdAmount * USD_TO_IND;
                currencyName = "USD";
                break;
            case 2:
                convertedAmount = usdAmount * CAN_TO_IND;
                currencyName = "CAN";
                break;

            default:
                System.out.println("Invalid choice. Exiting.");
                return;
        }

        // Display converted amount
        System.out.println(usdAmount + " USD is equal to " + convertedAmount + " " + currencyName);

        // Close scanner
        scanner.close();
    }
}
