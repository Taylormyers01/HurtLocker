import java.text.SimpleDateFormat;

public class Item {

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
                ", date=" + date.toString() +
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
}
