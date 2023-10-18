import java.util.Arrays;

public class bank {
    account[] accounts;

    public bank(account[] accounts) {
        this.accounts = accounts;
    }

    public double calculateAverageBalanceByCurrency(String targetCurrency) {
        double totalBalance = 0.0;
        int count = 0;

        targetCurrency = targetCurrency.toLowerCase();

        for (account account : accounts) {
            if (account == null) {
                continue;
            }

            if (account.getCurrency().toLowerCase().equals(targetCurrency)) {
                totalBalance += account.getBalance();
                count++;
            }
        }

        if (count == 0) {
            System.out.println("No accounts found with the specified currency: " + targetCurrency);
            return 0.0;
        }

        return totalBalance / count;
    }
}
