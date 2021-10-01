package homework5;

public class Fiction extends Book{

    private double price = 24.99;

    public Fiction(String title) {
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
        return "Fiction{ " + "title =  " +getTitle()+ ", "+
                " price = " + price +
                 " }";
    }
}
