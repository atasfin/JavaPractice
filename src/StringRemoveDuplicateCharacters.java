/**
 * 2) How to remove all duplicates from a given string?
 * *
 */


import java.util.HashSet;
import java.util.Set;

public class StringRemoveDuplicateCharacters {

    public static void main(String []args){

        String inputString = "A series of string has provided A quick brown fox jumps over the lazy dog.";
        removeDuplicate(inputString);

    }

    public static void removeDuplicate(String inputString){

        Set<Character> inputSet = new HashSet<>();
        char[] characterArray = inputString.toCharArray();



        for(int i=0; i<characterArray.length; i++){
            inputSet.add(characterArray[i]);
        }

        System.out.println("value" + inputSet);
    }



}
