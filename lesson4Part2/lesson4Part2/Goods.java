package lesson4Part2;

/**
 * Created by RomanM on 27.04.2014.
 */
public class Goods {
    private int idOfItem;
    private long price;

    public Goods(int idOfItem, long price) {
        this.idOfItem = idOfItem;
        this.price = price;
    }

    public int getIdOfItem() {
        return idOfItem;
    }

    public void setIdOfItem(int idOfItem) {
        this.idOfItem = idOfItem;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
