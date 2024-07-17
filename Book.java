public class Book extends Product{
    private String author;

    public Book() {
        super();
        this.author = "";
    }

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public double getDiscount() {
        return getPrice() * 0.4;
    }
    public double getPriceAfterDiscount(){
        return getPrice() - getDiscount();
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                 "\n " + super.toString() + "\n" +
                "Price after discount: " + getPriceAfterDiscount() + " SAR" +
                '}';
    }
}
