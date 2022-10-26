import java.util.HashMap;
import java.util.Map;

/**
 * 1a) How to count the occurrences of each character?
 * *
 */

public class StringCountAll {

    public static void main(String []args){

        String inputString = "A quick brown fox jumps ovEr the lazy dog";
        countOfCharacters(inputString);

    }

    public static void countOfCharacters(String input){

        Map<Character, Integer> characterMap = new HashMap<Character, Integer>();
        char charInputArray[] = input.toCharArray();
        for(Character i : charInputArray){
            if(characterMap.containsKey(i)){
                characterMap.put(i, characterMap.get(i)+1);
            } else{
                characterMap.put(i, 1);
            }
        }
        System.out.println(input + ":" + characterMap);

    }
}
