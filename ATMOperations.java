public class ATMOperations {

    public void deposit(UserAccount acc, double amount, TransactionHistory th) {
        acc.balance += amount;
        th.add("Deposited: ₹" + amount);
        System.out.println("Deposit successful.");
    }

    public void withdraw(UserAccount acc, double amount, TransactionHistory th) {
        if (amount <= acc.balance) {
            acc.balance -= amount;
            th.add("Withdrawn: ₹" + amount);
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void transfer(UserAccount acc, double amount, TransactionHistory th) {
        if (amount <= acc.balance) {
            acc.balance -= amount;
            th.add("Transferred: ₹" + amount);
            System.out.println("Transfer successful.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}