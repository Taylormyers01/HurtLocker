import java.util.ArrayList;

public class ItemList extends ArrayList<Item> {

    public ItemList(){
        super();
    }

    public void createAndAddItem(String name, double price,String type, String date){
        this.add(new Item(name, price,type , date));
    }


}
