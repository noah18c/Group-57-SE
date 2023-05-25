package assignment4;

public class Book {

    private int id, year;
    private String title, author;
    public Book(int id, int year, String title, String author){
        this.id = id;
        this.year = year;
        this.title = title;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
