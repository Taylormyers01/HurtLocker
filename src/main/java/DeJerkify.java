import java.util.ArrayList;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DeJerkify {

    public static String[] getItems(String input){
        return input.split(("#{2}"));
    }

    public static String[] getKeyValues(String input) {
//        Pattern p = Pattern.compile("[;,@,^,*,%]");
//        Matcher m = p.matcher(input);
//
////        return m.replaceAll(" ");
//
        return input.split("[;,@,^,*,%,!]");
    }

    public static String[] getValue(String input){
        if(input.split("(\\b:)").length>1){
            return input.split("(\\b:)");
        }
        return new String[] {" "," "};
    }





    public static String getPriceV2(String input){
        Pattern p = Pattern.compile("(\\d\\.\\d*)");
        Matcher matcher = p.matcher(input);
        if(matcher.find()){
            return matcher.group(0);
        }
        return " ";
    }
    public static String getNameV2(String input){
        Pattern p = Pattern.compile("(?<=:)[a-zA-Z]+");
        Matcher m = p.matcher(input);
        if(m.find()){
            return m.group(0);
        }
        return null;
    }
    public static String getTypeV2(String input){
        Pattern p = Pattern.compile("(?<=:)[a-zA-Z]+");
        Matcher m = p.matcher(input);
        int index = 0;
        String hold = " ";
        while(m.find() && index < 2){
            hold = m.group(0);
            index++;
        }
        return hold;
    }

    public static String getDateV2(String input){
        Pattern p = Pattern.compile("\\d{1,2}\\/\\d{1,2}\\/\\d{2,4}");
        Matcher m = p.matcher(input);
        if(m.find()){
            return m.group(0);
        }
        return null;
    }

    public static ArrayList<String> getItems2V2(String input){
        ArrayList<String> hold = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\w+:\\w+[!,;,%,^,@,*]\\w+:\\d\\.\\d+[!,;,%,^,@,*]\\w+:\\w+[!,;,%,^,@,*]\\w+:\\d{1,2}\\/\\d{1,2}\\/\\d{2,4}");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
            hold.add(matcher.group(0));
        }
        return hold;
    }

}
