package neighborhoodLibraryApp;


public class Library {
    private Book[] books;

    public Library() {
        books = new Book[20];

        books[0] = new Book(1, "978-3-16-148410-0", "The Great Gatsby", false, null);
        books[1] = new Book(2, "978-1-56619-909-4", "Moby Dick", true, "Alice Johnson");
        books[2] = new Book(3, "978-0-452-28423-4", "1984", false, null);
        books[3] = new Book(4, "978-0-7432-7356-5", "To Kill a Mockingbird", true, "John Smith");
        books[4] = new Book(5, "978-1-4028-9462-6", "Pride and Prejudice", false, null);
        books[5] = new Book(6, "978-0-553-21311-7", "Brave New World", true, "Emily Davis");
        books[6] = new Book(7, "978-0-14-303943-3", "The Catcher in the Rye", false, null);
        books[7] = new Book(8, "978-0-06-112008-4", "The Grapes of Wrath", true, "Michael Brown");
        books[8] = new Book(9, "978-0-452-28423-4", "The Picture of Dorian Gray", false, null);
        books[9] = new Book(10, "978-1-5011-7981-7", "The Fault in Our Stars", true, "Sarah Wilson");
        books[10] = new Book(11, "978-0-7432-7356-5", "Fahrenheit 451", false, null);
        books[11] = new Book(12, "978-0-14-018739-6", "The Bell Jar", true, "Jessica Miller");
        books[12] = new Book(13, "978-0-307-59158-2", "The Alchemist", false, null);
        books[13] = new Book(14, "978-1-59030-255-6", "The Hobbit", true, "David Johnson");
        books[14] = new Book(15, "978-0-14-243723-0", "War and Peace", false, null);
        books[15] = new Book(16, "978-0-06-240780-3", "Crime and Punishment", true, "Laura Garcia");
        books[16] = new Book(17, "978-1-56947-021-9", "Les Misérables", false, null);
        books[17] = new Book(18, "978-1-58008-042-5", "Jane Eyre", true, "Robert White");
        books[18] = new Book(19, "978-0-15-101026-4", "The Kite Runner", false, null);
        books[19] = new Book(20, "978-0-7432-7356-5", "Wuthering Heights", true, "Mary Green");

    }

    public Book[] getBooks() {
        return books;
    }
}
