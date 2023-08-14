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
}
