package javaminibank;

import java.util.Scanner;

public class BankServiceImplementation implements BankService{

    private final Scanner scanner = new Scanner(System.in);

    private final String cardNumber = "1234567890123456";
    private final String password = "Java123";

    @Override
    public boolean login() {


        //user has 3 rights to provide Card Number and password.
        int attempts = 3;

        while (attempts > 0) {

            System.out.println("Card number: ");
            String inputCardNumber = scanner.nextLine();
            //scanner.nextLine();

            System.out.println("Password: ");
            String inputPassword = scanner.nextLine().trim();
            //scanner.nextLine();

            if (inputCardNumber.equals(cardNumber) && (inputPassword.equals(password))) {
                System.out.println("Your login successful!");
                return true;
            }

            attempts--;
            System.out.println("Wrong credentials. Remaining attempts = " + attempts);
        }

        System.out.println("Card is blocked, please reach out the customer service.");
        return false;
    }


    @Override
    public void showMenu(){

        //Once login successful show the menu to user and wait until user chooses exit as no other options are available.
        int choice;

        do{

            System.out.println("\n===== JAVA BANK ATM =====");
            System.out.println("1 - Check your account balance");
            System.out.println("2 - Deposit money");
            System.out.println("3 - Withdraw money");
            System.out.println("4 - Password change");
            System.out.println("5 - Exit");
            System.out.print("Please select the operation by using numbers only(between 1 to 5)");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 5:
                    System.out.println("Your session is being finalized. See you soon.." );
                    break;
                default:
                    System.out.println("Invalid choice, please select exit as other operations not available.");

            }

        }while (choice != 5);
    }

    //----------------- end Bank Service implementation Class------------

}
