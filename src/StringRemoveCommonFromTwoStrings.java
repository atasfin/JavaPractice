
import java.util.ArrayList;
import java.util.List;

/**
 * 4) How to remove characters from the first String which are present in the second String?
 *
 * *
 */

public class StringRemoveCommonFromTwoStrings {

    public static void main(String []args){

        String string1 = "A quick brown fox jumps ovEr the lazy dog";
        String string2 = "A series of string has provided";

        removeDuplicateCharactersFromString(string1, string2);
    }

    public static void removeDuplicateCharactersFromString(String string1, String string2){

        char charArray1[] = string1.toCharArray();
        char charArray2[] = string2.toCharArray();
        List<Character> removeList = new ArrayList<>();
        List<Character> string1CharacterArraylist = new ArrayList<>();

        for(Character c : charArray1){
            string1CharacterArraylist.add(c);
        }

        System.out.println("duplicate work: " + string1CharacterArraylist);


        System.out.println(charArray1);
        int count = 0;
        if(string1.length() > string2.length()){
            for(int i=count; i<charArray1.length; i++){
                for(int j=0; j<charArray2.length; j++){
                    if(charArray1[i]==charArray2[j]){
                        count = count + 1;
                        removeList.add(charArray1[i]);
                        break;
                    }
                }
            }
        }

        for(Character a : removeList){
            if(string1CharacterArraylist.contains(a)){
                string1CharacterArraylist.remove(a);
            }
        }
        System.out.println(removeList);
        System.out.println(string1CharacterArraylist);
    }
}
