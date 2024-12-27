// Program 11: Class with account details and interest calculation
class Account {
    String accountNumber;
    String name;
    double amount;

    public Account(String accountNumber, String name, double amount) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.amount = amount;
    }

    public void calculateInterest() {
        double interest = amount * 0.08;
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Amount: " + amount);
        System.out.println("Interest: " + interest);
    }

    public static void main(String[] args) {
        Account account = new Account("123456", "Denish", 10000);
        account.calculateInterest();
    }
}