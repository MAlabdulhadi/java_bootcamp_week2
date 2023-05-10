public class Book extends Product{

    private String author ;

    public Book() {

    }

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public double getDiscount() {
        return getPrice()-(getPrice()*10/100);
    }

}
