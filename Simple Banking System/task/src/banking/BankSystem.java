package banking;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class BankSystem {

    private final Map<String, BankAccount> accounts = new HashMap<>();
    private BankAccount currentAccount;

    public void showStartMenu() {
        System.out.println("1. Create an account");
        System.out.println("2. Log into account");
        System.out.println("0. Exit");
    }

    public void showLoginMenu() {
        System.out.println("1. Balance");
        System.out.println("2. Log out");
        System.out.println("0. Exit");
    }

    public void createAccount() {
        BankAccount bankAccount = BankAccount.createNewBankAccount();
        accounts.put(bankAccount.getCardNumber(), bankAccount);
        System.out.println("Your card has been created");
        System.out.println("You card number:");
        System.out.println(bankAccount.getCardNumber());
        System.out.println("Your card PIN:");
        System.out.println(bankAccount.getPin());
    }

    public boolean logIntoAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your card number;");
        String cardNumber = scanner.nextLine();
        System.out.println("Enter your PIN:");
        int pinCode = Integer.parseInt(scanner.nextLine());

        boolean isValidCheckSum = checkCheckSum(cardNumber);
        BankAccount bankAccount = accounts.get(cardNumber);
        if (!isValidCheckSum || bankAccount == null || bankAccount.getPin() != pinCode) {
            System.out.println("Wrong card number or PIN!");
            return false;
        }

        System.out.println("You have successfully logged in!");
        currentAccount = bankAccount;
        return true;
    }

    private boolean checkCheckSum(String substring) {
        return BankAccount.getLuhnBasedSumOfDigits(substring) % 10 == 0;
    }

    public void printBalance() {
        Objects.requireNonNull(currentAccount);
        currentAccount.printBalance();
    }

    public boolean logOut() {
        Objects.requireNonNull(currentAccount);
        currentAccount = null;
        System.out.println("You have successfully logged out!");
        return false;
    }

    public void exit() {
        System.out.println("Bye!");
        System.exit(0);
    }
}