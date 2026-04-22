import java.util.ArrayList;
import java.util.Scanner;

// 1. The Book Class
class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Title: \"" + title + "\" | Author: " + author;
    }
}

// 2. The Main Management System
public class LibrarySystem {
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("--- Welcome to the Digital Library ---");

        while (running) {
            System.out.println("\n1. Add Book\n2. Issue (Remove) Book\n3. Search Book\n4. Display All\n5. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    bookList.add(new Book(title, author));
                    System.out.println("Book added successfully!");
                    break;

                case 2:
                    System.out.print("Enter the title of the book to issue: ");
                    String issueTitle = scanner.nextLine();
                    boolean removed = bookList.removeIf(book -> book.getTitle().equalsIgnoreCase(issueTitle));
                    if (removed) {
                        System.out.println("Book issued and removed from library.");
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter title to search: ");
                    String searchTitle = scanner.nextLine();
                    boolean found = false;
                    for (Book b : bookList) {
                        if (b.getTitle().equalsIgnoreCase(searchTitle)) {
                            System.out.println("Result: " + b);
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("Book not found in records.");
                    break;

                case 4:
                    if (bookList.isEmpty()) {
                        System.out.println("The library is currently empty.");
                    } else {
                        System.out.println("\n--- Current Book Inventory ---");
                        bookList.forEach(System.out::println);
                    }
                    break;

                case 5:
                    running = false;
                    System.out.println("Exiting System. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        scanner.close();
    }
}
