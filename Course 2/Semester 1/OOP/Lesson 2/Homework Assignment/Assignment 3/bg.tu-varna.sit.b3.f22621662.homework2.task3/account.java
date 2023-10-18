import java.util.Objects;

public class account {
    String accountNumber;
    String currency;
    double balance;

    public account(String accountNumber, String currency, double balance) {
        this.accountNumber = accountNumber;
        this.currency = currency.toLowerCase();
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency.toLowerCase();
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", currency='" + currency + '\'' +
                ", balance=" + balance +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        account account = (account) o;
        return Double.compare(account.balance, balance) == 0 && accountNumber.equals(account.accountNumber) && currency.equals(account.currency);
    }
}
