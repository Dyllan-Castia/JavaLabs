//NOTE: Overridden toString() method may be part of the TreeMap class.
import java.util.TreeMap;
import java.util.Map;

public class Main {
    private TreeMap<String, String> books = new TreeMap<>();

    public void addOrUpdateBook(String isbn, String title) {
        // TODO 1: add or update to the TreeMap
        books.put(isbn, title);
        System.out.println("Book with ISBN: " + isbn + " has been added/updated.");
    }

    public void removeBook(String isbn) {
        // TODO 2: check and remove only if present from the TreeMap, else print appropriate message
        if (books.containsKey(isbn)) {
            books.remove(isbn);
            System.out.println("Book with ISBN: " + isbn + " has been removed.");
        } else {
            System.out.println("Book with ISBN: " + isbn + " not available.");
        }
    }

    public void getBookTitle(String isbn) {
        // TODO 3: get from TreeMap and print appropriate message if not found
        if (books.get(isbn) != null) {
            System.out.println("ISBN: "+ isbn + " is " +  books.get(isbn));
        }

    }

    public void displayAllBooks() {
        // TODO 4: display all the elements in TreeMap
        //for (Map.Entry<String, String> entry : books.entrySet()) {
        //    System.out.println(entry);
       //} Or since there is an overridden toString method:
       System.out.println("All books: " + "\n" + books);
    }

    public static void main(String[] args) {
        Main inventory = new Main();

        // Add or update books
        inventory.addOrUpdateBook("978-0134685991", "Effective Java");
        inventory.addOrUpdateBook("978-1491950357", "Clean Architecture");
        inventory.addOrUpdateBook("978-0132350884", "Clean Code");

        // Display all books
        inventory.displayAllBooks();

        // Retrieve the title of a specific book by ISBN
        inventory.getBookTitle("978-0134685991");

        // Remove a book
        inventory.removeBook("978-1491950357");

        // Display all books after removal
        inventory.displayAllBooks();
    }
}

/* Output:
Book with ISBN: 978-0134685991 has been added/updated.
Book with ISBN: 978-1491950357 has been added/updated.
Book with ISBN: 978-0132350884 has been added/updated.
All books: 
{978-0132350884=Clean Code, 978-0134685991=Effective Java, 978-1491950357=Clean Architecture}
ISBN: 978-0134685991 is Effective Java
Book with ISBN: 978-1491950357 has been removed.
All books: 
{978-0132350884=Clean Code, 978-0134685991=Effective Java}
*/
