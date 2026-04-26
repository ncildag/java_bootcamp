package MiniBookStore;

import java.util.Scanner;

public class MiniBookStoreApp {

    public static void main(String[] args) {
        start();
    }

    private static void start() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Mini Book Store ---");
        int select;

        do{
            System.out.println("Product Management Portal");
            System.out.println("1-Books");
            System.out.println("2-Notebooks");
            System.out.println("0-Exit");

            System.out.println("Your choice: ");
            select = scanner.nextInt();
            scanner.nextLine(); //must use after int and double as /n will remain after user hit enter key.

            // In case user selected 1 or 2.
            ProductService service;
            if (select == 1){
                service = new BookService();
                service.processMenu();
            } else if (select == 2){
                service = new NotebookService();
                service.processMenu();
            } else if (select == 0) {
                System.out.println("Thanks, see you soon!");
            } else {
                System.out.println("Your choice is not correct!");
            }

        }while(select != 0);

    }

}
