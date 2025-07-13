import java.util.*;
public class LibraryManagement {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        int choice;

        do {
            System.out.println("\n====== Library Management ======");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. View All Books");
            System.out.println("4. Search Book");
            System.out.println("5. Borrow Book");
            System.out.println("6. Return Book");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();
                    Book book = new Book(id, title, author,false);
                    library.addBook(book);
                    break;
                case 2:
                    System.out.print("Enter Book ID to remove: ");
                    int removeId = sc.nextInt();
                    library.removeBook(removeId);
                    break;
                case 3:
                    library.viewAllBooks();
                    break;
                case 4:
                    sc.nextLine();
                    System.out.print("Enter keyword (title/author): ");
                    String keyword = sc.nextLine();
                    library.searchBook(keyword);
                    break;
                case 5:
                    System.out.print("Enter Book ID to borrow: ");
                    int borrowId = sc.nextInt();
                    library.borrowBook(borrowId);
                    break;
                case 6:
                    System.out.print("Enter Book ID to return: ");
                    int returnId = sc.nextInt();
                    library.returnBook(returnId);
                    break;
                case 7:
                    System.out.println("Thank you for using Library Management.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 7);
     sc.close();
    }
}