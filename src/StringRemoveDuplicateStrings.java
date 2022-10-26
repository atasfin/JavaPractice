/**
 * 2a) How to remove all duplicates string from a given string?
 * *
 */

import java.util.HashSet;
import java.util.Set;

public class StringRemoveDuplicateStrings {

    public static void main(String []args){

        String inputString = "A series of string has provided A quick brown fox jumps over the lazy dog string has provided a lazy dog";
        removeDuplicate(inputString);

    }

    public static void removeDuplicate(String inputString){

        Set<String> inputSet = new HashSet<>();
        String [] stringArrayInput;
        stringArrayInput = inputString.split(" ");

        for(String i : stringArrayInput){
            inputSet.add(i);
        }
        System.out.println("value" + inputSet);
    }



}
