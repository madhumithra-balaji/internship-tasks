import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        UserAccount acc = new UserAccount();
        Authentication auth = new Authentication();
        ATMOperations ops = new ATMOperations();
        TransactionHistory th = new TransactionHistory();

        System.out.print("Enter User ID: ");
        int id = sc.nextInt();

        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();

        if (auth.validate(id, pin, acc)) {
            System.out.println("\nLogin Successful!");

            int choice;
            do {
                System.out.println("\nATM MENU");
                System.out.println("1. Transaction History");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.println("4. Transfer");
                System.out.println("5. Quit");
                System.out.print("Enter choice: ");

                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        th.show();
                        break;

                    case 2:
                        System.out.print("Enter amount: ");
                        ops.withdraw(acc, sc.nextDouble(), th);
                        break;

                    case 3:
                        System.out.print("Enter amount: ");
                        ops.deposit(acc, sc.nextDouble(), th);
                        break;

                    case 4:
                        System.out.print("Enter amount: ");
                        ops.transfer(acc, sc.nextDouble(), th);
                        break;

                    case 5:
                        System.out.println("Thank you for using ATM.");
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }

            } while (choice != 5);

        } else {
            System.out.println("Invalid User ID or PIN.");
        }

        sc.close();
    }
}