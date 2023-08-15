import java.util.*;

public class ItemList extends ArrayList<Item> {

    public ItemList(){
        super();
    }

    Map<String, Map<Double, Integer>> outputInfo = new HashMap<>();

    public void createAndAddItem(String input){
        this.add(new Item(DeJerkify.getNameV2(input).toLowerCase(),
                Double.parseDouble(DeJerkify.getPriceV2(input))
                ,DeJerkify.getTypeV2(input),DeJerkify.getDateV2(input)));
    }

    public void countItems(){
        for(Item i: this){
            if(outputInfo.containsKey(i.getName())){
                Map<Double, Integer> hold = outputInfo.get(i.getName());
                if(hold.containsKey(i.getPrice())){
                    Integer iterate = hold.get(i.getPrice());
                    hold.put(i.getPrice(), iterate+1);
                }
                else{
                    hold.put(i.getPrice(), 1);
                }
            }
            else{
                if(i.getName().contains("co") && outputInfo.containsKey("cookies")){
                    Map<Double, Integer> hold = outputInfo.get("cookies");
                    if(hold.containsKey(i.getPrice())){
                        Integer iterate = hold.get(i.getPrice());
                        hold.put(i.getPrice(), iterate+1);
                    }
                    else{
                        hold.put(i.getPrice(), 1);
                    }
                }else{
                    HashMap<Double, Integer> firstInput = new HashMap<>();
                    firstInput.put(i.getPrice(), 1);
                    outputInfo.put(i.getName(), firstInput);
                }
            }
        }
    }

    public void printCount(){
       for(Map.Entry e: outputInfo.entrySet()){
           System.out.println(e);
       }
    }


}
