import org.apache.commons.io.IOUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public String readRawDataToString() throws Exception{
        ClassLoader classLoader = getClass().getClassLoader();
        String result = IOUtils.toString(classLoader.getResourceAsStream("RawData.txt"));
        return result;
    }

    public static void main(String[] args) throws Exception{
        String output = (new Main()).readRawDataToString();
//        System.out.println(output);
//        ArrayList<String> data = parseData(output);
//        ItemList il = createItems(data);
//        il.forEach(System.out::println);
        

    }

//    public static ArrayList<String> parseData(String input){
//        ArrayList<String> output1 = new ArrayList<>(),output2 = new ArrayList<>();
//        Arrays.stream(DeJerkify.getItems(input))
//                .map(DeJerkify::getKeyValues).
//                forEach(item -> output1.addAll(Arrays.asList(item)));
//        output1.stream()
//                .map(DeJerkify::getValue)
//                .forEach(item -> output2.add(item[1]));
////        output2.forEach(System.out::println);
//        return output2;
//    }
//
//    public static ItemList createItems(ArrayList<String> data){
//        Pattern pattern = Pattern.compile("[a-zA-Z]+\\d\\.+\\w+\\d{1,2}\\/\\d{1,2}\\/\\d{2,4}"); //
//        ItemList il = new ItemList();
//        for(int i = 0; i < data.size(); i = i + 4){
//           if(pattern.matcher(data.get(i)+data.get(i+1)+data.get(i+2)+data.get(i+3)).find()){
//               il.createAndAddItem(data.get(i).toLowerCase(), Double.valueOf(data.get(i+1)), data.get(i+2), data.get(i+3));
//           }
////            else{
////               il.createAndAddItem("Bad input", Double.parseDouble(data.get(i+1)), data.get(i+2), data.get(i+3));
////            }
//             else{// if(!pattern.matcher(data.get(i)+data.get(i+1)+data.get(i+2)+data.get(i+3)).find())
//                 try {
//                     il.createAndAddItem(data.get(i).toLowerCase(), Double.valueOf(data.get(i + 1)), data.get(i + 2), data.get(i + 3));
//                 }catch (Exception e){
//                     il.createAndAddItem(data.get(i).toLowerCase(), 0.00, data.get(i + 2), data.get(i + 3));
//                 }
//            }
//        }
//        return il;
//
//    }
}
