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

        // Scanner for input
        Scanner userInput = new Scanner(System.in);
        System.out.println("Hello Welcome to the neighborhood library.");

        // implemented while loop to keep home screen running
        while (true) {
            // Home screen menu
            System.out.print("Type \n a: To show available books. \n b: To show checked out books. \n c: To Check in a book.\n x: to exit \n");
            String input = userInput.nextLine();

            // Implemented switch statement for menu options
            // made input to lowercase using method
            switch (input.toLowerCase()) {

                // show available books
                case "a":
                    System.out.println("Here is a list of available books.");
                    // retrieves book array from bookList method and stores it in available books
                    Book[] availableBooks = Book.bookList();
                    //enhanced for loop to loop through book array and show books that are not checked out.
                    for (Book book : availableBooks) {
                        if (!book.isCheckedOut()) {
                            System.out.println("Book ID: " + book.getId() + ",ISBN: " + book.getIsbn() + ",Book title: " + book.getTitle());
                        }
                    }

                    // check out menu in available books menu
                    System.out.println("Do you want to check out a book?\n Enter \n '1' to check out \n '2' to exit.");
                    int continueInput = userInput.nextInt();
                    userInput.nextLine();
                    if(continueInput == 1){
                        System.out.println("Please enter your name: ");
                        String usersName = userInput.nextLine();

                        System.out.println("Please enter book ID: ");
                        int bookId = userInput.nextInt();
                        userInput.nextLine();

                        // enhanced for loop for available books with if statement to check book id and if that book is available
                        for(Book book : availableBooks) {
                            if(bookId == book.getId() && !book.isCheckedOut()){

                                // uses method from book class checkOutBook() to check out book.
                                book.checkOutBook(usersName);
                                System.out.println("Your book: " + book.getTitle() + "is now checked out by " + book.getCheckedOutTo()+ "\n" + "Book is checked out: " + book.isCheckedOut());
                            }
                        }
                    }
                    break;
                // show checked out books
                case "b":
                    System.out.println("Here is a list of checked out books.");
                    Book[] checkedOutBooks = Book.bookList();
                    for (Book book : checkedOutBooks) {
                        if (book.isCheckedOut()) {
                            System.out.println("Book ID: " + book.getId() + ",ISBN: " + book.getIsbn() + ",Book title: " + book.getTitle() + ",Checked out by: " + book.getCheckedOutTo());
                        }

                    }
                    System.out.println("Enter \n 'C' to Check In a book. \n 'X' to exit.");
                    String continueInput2 = userInput.nextLine();

                    //switch statement for checked out books that lets you pick if you want to check in a book.
                    switch (continueInput2.toUpperCase()){
                        case "C":
                            System.out.println("Please enter book ID: ");
                            int bookId = userInput.nextInt();
                            userInput.nextLine();
                            for(Book book : checkedOutBooks){

                                //compares bookId given by user and looks for that bookID with book.getId
                                if(bookId == book.getId()){
                                    //sets checked out to false
                                    book.setCheckedOut(false);
                                    // sets checkedOutTo " "
                                    book.setCheckedOutTo("(available)");
                                    System.out.println("Thank you for returning your book!");
                                    System.out.println("Title: " + book.getTitle() + " is checked out? " + book.isCheckedOut() + " ,is checked out to: " + book.getCheckedOutTo());
                                }
                            }
                            break;

                        case "X":
                            break;

                    }
                    break;

                // Check in books option
                case "c":
                    Book[] checkInList = Book.bookList();
                    System.out.println("Please enter book ID: ");
                    int bookId = userInput.nextInt();
                    userInput.nextLine();
                    for(Book book : checkInList) {

                        if (bookId == book.getId()) {
                            //sets checked out to false
                            book.setCheckedOut(false);
                            // sets checkedOutTo " "
                            book.setCheckedOutTo("(available)");
                            System.out.println("Thank you for returning your book!");
                            System.out.println("Title: " + book.getTitle() + " is checked out? " + book.isCheckedOut() + " ,is checked out to: " + book.getCheckedOutTo());
                        }
                    }
                    break;

                case "x":
                    System.out.println("GoodBye!");
                    userInput.close();
                    return;

                    // default case for when user inputs something besides switch case options
                default:
                    System.out.println("Invalid Input");
            }
            // if statement to turn while loop from true to false
            System.out.print("Do you want to continue? (yes/no):");
            String continueInput = userInput.nextLine();
            if (continueInput.equalsIgnoreCase("no")) {
                    System.out.println("Goodbye!");
                    break;
                }

        }
    }
}
