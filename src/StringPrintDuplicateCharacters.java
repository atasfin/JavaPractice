/**
 * 3) How to print the duplicate characters from the given String?
  * *
 */


import java.util.*;

public class StringPrintDuplicateCharacters {

    public static void main(String []args){

        String inputString = "A series of string has provided A quick brown fox jumps over the lazy dog.";
        removeDuplicate(inputString);

    }

    public static void removeDuplicate(String inputString){

        Map<Character, Integer> countMap = new HashMap<>();
        char[] characterArray = inputString.toCharArray();

        for(char i : characterArray){
            if(countMap.containsKey(i)){
                countMap.put(i, countMap.get(i)+1);
            } else{
                countMap.put(i, 1);
            }
        }
        System.out.println("Before Remove::" + inputString + ":" + countMap);

        ArrayList<Character> removeList = new ArrayList<>();

        for(Map.Entry<Character, Integer> entry : countMap.entrySet()){
            if(entry.getValue() < 2){
               removeList.add(entry.getKey());
            }
        }

        for(char removeKey : removeList){
            countMap.remove(removeKey);
        }

        System.out.println("After Remove::" + inputString + ":" + countMap);

    }

}
