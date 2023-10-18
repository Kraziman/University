public class application3 {
    public static void main(String[] args) {
        // Създаване на няколко обекта Account
        account account1 = new account("12345", "USD", 1000.0);
        account account2 = new account("54321", "EUR", 750.0);
        account account3 = new account("98765", "USD", 1200.0);

        // Създаване на масив от сметки
        account[] accounts = {account1, account2, account3};

        // Създаване на обект от клас Bank
        bank bank = new bank(accounts);

        // Изчисляване и отпечатване на средната наличност по валута (например, "USD")
        String targetCurrency = "USD";
        double averageBalance = bank.calculateAverageBalanceByCurrency(targetCurrency);
        System.out.println("Average balance in " + targetCurrency + ": " + averageBalance);
    }
}
