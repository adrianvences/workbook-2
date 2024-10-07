package neighborhoodLibraryApp;

import java.util.Scanner;

public class LibraryApp {


    /* this Class is the main class and will call from Book Class
     * - - menu should show - -
     * - a choice for check out books
     * - checked in books
     * - check in
     * - exit choice
     *
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Hello Welcome to the neighborhood library.");
        while (true) {

            System.out.print("Type \n a: To show available books. \n b: To show checked out books. \n c: To exit.\n");
            String input = userInput.nextLine();

            switch (input.toLowerCase()) {

                case "a":
                    Book[] availableBooks = Book.bookList();
                    for (Book book : availableBooks) {
                        if (!book.isCheckedOut()) {
                            System.out.println("Book ID: " + book.getId() + ",ISBN: " + book.getIsbn() + ",Book title: " + book.getTitle());
                        }
                    }

                case "b":
                    Book[] checkedOutBooks = Book.bookList();
                    for (Book book : checkedOutBooks) {
                        if (book.isCheckedOut()) {
                            System.out.println("Book ID: " + book.getId() + ",ISBN: " + book.getIsbn() + ",Book title: " + book.getTitle());
                        }
                    }
                case "c":
                    break;
            }
            System.out.print("Do you want to continue? (yes/no):");
            String continueInput = userInput.nextLine();
            if (continueInput.equalsIgnoreCase("no")) {
                    System.out.println("Goodbye!");
                    break;
                }

        }
    }
}
