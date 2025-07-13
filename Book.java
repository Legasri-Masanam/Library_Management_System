public class Book {
    private int id;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(int id, String title ,String author , boolean  isAvailable ){
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public int getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public boolean isAvailable(){
        return isAvailable;
    }

    public void setAvailable(boolean available ){
        isAvailable = available;
    }
    public String toString(){
        return "id: "+ id + "\nTitle: "+ title +"\nAuthor: "+ author +
                "\nisAvailable: "+ (isAvailable ? "yes":"no");
    }
}
