package MiniBookStore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookService implements ProductService {

    Scanner inp = new Scanner(System.in);

    //Storing books.
    List<Book> bookList = new ArrayList<>();

    //initial testing books
    public BookService() {
        Book book1 = new Book("Vadideki Zambak", 150.0, 25, "Balzac", "Per");
        Book book2 = new Book("Suc ve Ceza", 150.0, 12, "Dostoyevski", "Per");
        Book book3 = new Book("Sefiller", 150.0, 15, "V.Hugo", "Dream");
        this.bookList.add(book1);
        this.bookList.add(book2);
        this.bookList.add(book3);
    }

    //  Menu related to book service
    @Override
    public void processMenu() {
        int select;

        do {
            System.out.println("--------------------------------------------------------");
            System.out.println("1-Shows the list of books");
            System.out.println("2-Add book");
            System.out.println("3-Delete book");
            System.out.println("4-Filter by publisher");
            System.out.println("0-Return");
            System.out.println("Your choice:");
            select = inp.nextInt();
            inp.nextLine(); //must use after int and double as /n will remain after user hit enter key.

            switch (select) {
                case 1:
                    listProducts();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    listProducts();
                    removeProduct();
                    break;
                case 4:
                    System.out.println("Publisher:");
                    String pub = inp.nextLine();
                    filterProduct(pub);
                    break;
                case 0:
                    System.out.println("You are being directed to main menu.");
                    break;
                default:
                    System.out.println("Your choice is not being defined, please try again!");
                    break;
            }

        } while (select != 0);

    }

    @Override
    public void listProducts() {

        System.out.println("--------------------------------------------------------");
        System.out.printf("%-2s | %-20s | %-15s | %-10s | %-12s | %-5s \n", "ID", "Book", "Writer", "Publisher", "Price", "Stock");
        for (Book book : this.bookList) {
            System.out.printf("%-2s | %-20s | %-15s | %-10s | %-12s | %-5s \n",
                    book.getId(), book.getName(), book.getAuthorName(), book.getPublisher(), book.getPrice(), book.getStock());
        }
        System.out.println("--------------------------------------------------------");
    }

    @Override
    public void addProduct() {
        System.out.println("Book name: ");
        String bookname = inp.nextLine();

        System.out.println("Author name: ");
        String author = inp.nextLine();

        System.out.println("Publisher name: ");
        String pub = inp.nextLine();

        System.out.println("Price: ");
        double price = inp.nextDouble();
        inp.nextLine(); //must use after int and double as /n will remain after user hit enter key.

        System.out.println("Stock: ");
        int stock = inp.nextInt();
        inp.nextLine(); //must use after int and double as /n will remain after user hit enter key.

        //Create a new book.
        Book newBook = new Book(bookname, price, stock, author, pub);
        this.bookList.add(newBook);

    }

    @Override
    public void removeProduct() {

        //get the product ID from user and remove from list.

        boolean isExist = true;

        System.out.println("Book ID");
        int id = inp.nextInt();
        inp.nextLine(); //must use after int and double as /n will remain after user hit enter key.

        for (Book book : this.bookList) {
            if (book.getId() == id) {
                isExist = true;
                this.bookList.remove(book);
                System.out.println("Book has been deleted!");
                break;

            } else {
                isExist = false;
            }
        }
        if (!isExist) {
            System.out.println("Book is not found.");
        }

    }

    @Override
    public void filterProduct(String filter) {

        System.out.println("--------------------------------------------------------");
        System.out.printf("%-2s | %-20s | %-15s | %-10s | %-12s | %-5s \n", "ID", "Book", "Writer", "Publisher", "Price", "Stock");
        for (Book book : this.bookList) {
            if (book.getPublisher().equalsIgnoreCase(filter)) {
                System.out.printf("%-2s | %-20s | %-15s | %-10s | %-12s | %-5s \n",
                        book.getId(), book.getName(), book.getAuthorName(), book.getPublisher(), book.getPrice(), book.getStock());
            }
            System.out.println("--------------------------------------------------------");
        }
    }
}
