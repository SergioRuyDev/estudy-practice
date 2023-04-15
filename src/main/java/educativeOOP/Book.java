package educativeOOP;

abstract class Book {
    // Protected Fields
    protected String name;
    protected String author;
    protected String price;

    // Parameterized Constructor
    public Book(String name, String author, String price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    // Abstract Method
    public abstract String getDetails();
}

// Class MyBook extending Book Class
class MyBook extends Book {

    // Parameterized Constructor
    public MyBook(String name, String author, String price) {
        super(name, author, price);
    }

    // Overriding the getDetails Abstract Method of the Base Class
    public String getDetails() {
        return name + ", " + author + ", " + price;
    }

}
