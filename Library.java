import java.util.*;
public class Library{
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
        System.out.println("Successfully added your book!");
    }
    public void removeBook(int id){
        Book book1 = findBookbyId(id);
        if(book1 != null){
            books.remove(book1);
            System.out.println("Your book is removed successfully");
        }
        else System.out.println("Book not found!!");
    }
    public void viewAllBooks(){
        if(books.isEmpty()){
            System.out.println("No Books Available");
            return;
        }

        for(Book book : books)
            System.out.println(book);

    }
    public void searchBook(String keyWord){
        boolean found = false;
        for(Book book : books){
            if(book.getTitle().toLowerCase().contains(keyWord.toLowerCase())
                    || book.getAuthor().toLowerCase().contains(keyWord.toLowerCase()))
                System.out.println(book +" book founded");
            found = true;
        }
        if(!found)
            System.out.println("No match found!!");

    }

    public void borrowBook(int id){
        Book book = findBookbyId(id);
        if(book != null && book.isAvailable()){
            book.setAvailable(false);
            System.out.println("Successfully borrowed the book ");

        }
        else if (book != null) {
            System.out.println("Book is currently unavailable.");
        } else {
            System.out.println("Book not found.");
        }
    }

    public void returnBook(int  id){
        Book book = findBookbyId(id);
        if (book != null && !book.isAvailable()) {
            book.setAvailable(true);
            System.out.println("Book returned successfully.");
        } else if (book != null) {
            System.out.println("Book is not borrowed.");
        } else {
            System.out.println("Book not found.");
        }
    }
    private Book findBookbyId(int id) {
        for (Book b : books) {
            if (b.getId() == id) return b;
        }
        return null;
    }

}