import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ItemList extends ArrayList<Item> {

    public ItemList(){
        super();
    }


    public void createAndAddItem(String input){
        this.add(new Item(DeJerkify.getNameV2(input).toLowerCase(),
                Double.parseDouble(DeJerkify.getPriceV2(input))
                ,DeJerkify.getTypeV2(input),DeJerkify.getDateV2(input)));
    }




}
