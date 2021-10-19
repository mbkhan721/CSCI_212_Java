package PracticeExam01;

public class Book {
    private String title, author;
    private float price;

    public Book(String t, String a, float p) {

        if (t == null) {
            throw new IllegalArgumentException("Incorrect title");
        }
        if (a == null) {
            throw new IllegalArgumentException("Incorrect author");
        }
        if (p < 0) {
            throw new IllegalArgumentException("Incorrect price");
        }

        title = t;
        author = a;
        price = p;
    }

    // Accessors
    public String getTitle() {return title;}
    public String getAuthor() {return author;}
    public float getPrice() {return price;}

    // Mutators
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPrice(float price) {
        this.price = price;
    }
}
