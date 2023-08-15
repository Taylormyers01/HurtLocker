import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Objects;

public class Item implements Comparator<Item>{

    private String name;
    private Double price;
    private String type;
    private SimpleDateFormat date;

    public Item(String name, Double price,String type, String date) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.date = new SimpleDateFormat(date);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", date=" + date.toPattern() +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public SimpleDateFormat getDate() {
        return date;
    }

    public void setDate(SimpleDateFormat date) {
        this.date = date;
    }

    @Override
    public int compare(Item o1, Item o2) {
        return o1.name.compareTo(o2.name);
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(name, item.name) && Objects.equals(price, item.price) && Objects.equals(type, item.type) && Objects.equals(date, item.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, type, date);
    }


}
