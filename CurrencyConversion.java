public class CurrencyConversion {
    public static void main(String[] args) {
        double amountInUSD = 100;
        double exchangeRateUSDToEUR = 0.85;
        System.out.println("Initial amount in USD: " + amountInUSD);
        double amountInEUR = amountInUSD * exchangeRateUSDToEUR;
        System.out.println("Amount in EUR after conversion: " + amountInEUR);
        amountInEUR -= 55;
        System.out.println("Amount in EUR after expenditure: " + amountInEUR);
        double amountBackToUSD = amountInEUR / exchangeRateUSDToEUR;
        System.out.printf("Amount in USD after converting back: %.2f", amountBackToUSD);
    }
}