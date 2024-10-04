package neighborhoodLibraryApp;

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
        Book myBook = new Book();
        System.out.println(myBook.isCheckedOut);
    }
}
