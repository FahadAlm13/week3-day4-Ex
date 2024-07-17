public class Movie extends Product{
    private String director;

    public Movie(){
        super();
        this.director = "";
    }

    public Movie(String name, double price, String director) {
        super(name, price);
        this.director = director;
    }

    public String getDirector() {

        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public double getDiscount() {
        return getPrice() * 0.2;
    }
    public double getPriceAfterDiscount(){
        return getPrice() - getDiscount();
    }

    @Override
    public String toString() {
        return "Movie{" +
                "director='" + director + '\'' +
                "\n"+super.toString() +
                "\n" +
                "Price after discount: " + getPriceAfterDiscount() + " SAR" +
                '}';
    }
}
