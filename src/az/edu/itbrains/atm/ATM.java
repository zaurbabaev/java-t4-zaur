//package az.edu.itbrains.atm;
//
//public class ATM {
//
//    private double balance;
//    private double amount;
//    private double deposit;
//
//
//    public void checkBalance() {
//        System.out.println("Your balance is: " + balance);
//    }
//
//
//    public void withdraw() {
//        System.out.println("Enter the amount to withdraw:");
//        int amount = scanner.nextInt();
//        if (amount > balance) {
//            System.out.println("Insufficient balance! Please try again.");
//        } else {
//            balance -= amount;
//            System.out.println("Please collect your cash.");
//            System.out.println("Your updated balance is: " + balance);
//        }
//    }
//
//    public void deposit() {
//        System.out.println("Enter the amount to deposit");
//        int amount = scanner.nextInt();
//        balance += amount;
//        System.out.println("Your updated balance is: " + balance);
//    }
//
//
//}
