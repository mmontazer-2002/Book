package homework5;

public class NonFiction extends Book{
    private double price = 37.99;

    public NonFiction(String title) {
        super(title);
        setPrice(this.price);
    }

    @Override
    public void setPrice(double price) {
                price = this.price;
    }

    @Override
    public void display() {
        System.out.println("Title :" + getTitle() + "Price : " + price);
    }

    @Override
    public String toString() {
        return "NonFiction{" + "title = " +getTitle()+ ","+
                " price = " + price +
                " }";
    }
}
