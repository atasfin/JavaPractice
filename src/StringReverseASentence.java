/**
 * 10) How to reverse the words in a given String sentence?
 *
 */

import java.util.ArrayList;
import java.util.List;

public class StringReverseASentence {

    public static void main(String []args){

        String str = "This is a sentence of string";
        reverseSentence(str);
    }

    public static void reverseSentence(String str){

        String stringArray[] = str.split(" ");
        List<String> reverseStringList = new ArrayList<String>();
        String reverseSentence = "";

        for(int i = stringArray.length-1; i>=0; i--){
            reverseStringList.add(stringArray[i]);
        }
        System.out.println(reverseStringList);

        for (String item : reverseStringList) {
            reverseSentence = reverseSentence + item + " ";
        }

        System.out.println(reverseSentence);

    }

}
