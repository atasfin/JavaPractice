import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 9) How to find the first non-repeating character in a given String?
 *
 */
public class StringFirstNonRepeatingCharacter {

    public static void main(String []args){

        String str = "kfzrststkring";
        firstNonRepeatingCharacterMap(str);
    }


    public static void firstNonRepeatingCharacterMap(String str)
    {
        char token = 0;
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        char input[] = str.toCharArray();
        for(Character character : input){
            if(characterIntegerMap.containsKey(character)){
                characterIntegerMap.put(character, characterIntegerMap.get(character)+1);
            } else {
                characterIntegerMap.put(character, 1);
            }
        }
        System.out.println(characterIntegerMap);
        
        for(int i=0; i<input.length; i++){
            if(characterIntegerMap.get(input[i])==1){
                token = input[i];
                break;
            }
        }
        System.out.println(token);
    }

}
