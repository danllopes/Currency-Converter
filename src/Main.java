import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        var sc = new Scanner(System.in);

        System.out.print("\n\nWhat is the dollar price? ");
        double price = sc.nextDouble();

        System.out.print("\nHow manu dollars will be bought: ");
        double amount = sc.nextDouble();

        System.out.printf("\nAmount to be paid in reais =  %.2f\n\n", CurrencyConverter.converter(price, amount));

        sc.close();
    }
}