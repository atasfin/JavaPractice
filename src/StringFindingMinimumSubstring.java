import java.util.HashMap;
import java.util.Map;

public class StringFindingMinimumSubstring {

    public static void main(String []args){

        String string1 = "this is a test string";
        String string2 = "tist";

        char characterArrayString1[] = string2.toCharArray();

        Map<Character, Integer> frequencyCountCharString1 = new HashMap<Character, Integer>();

        for(Character item: characterArrayString1){
            if(frequencyCountCharString1.containsKey(item)){
                frequencyCountCharString1.put(item, frequencyCountCharString1.get(item) + 1);
            } else {
                frequencyCountCharString1.put(item, 1);
            }
        }

        System.out.println(frequencyCountCharString1);

    }


}
