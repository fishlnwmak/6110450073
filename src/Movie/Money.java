package Movie;

public class Money {
    private int price;

    public void Money(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
    public int addmoney(int m){
        price += m;
        return price;
    }
}
