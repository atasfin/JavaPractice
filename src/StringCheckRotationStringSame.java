import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 5) How to check if two strings are rotations of each other?
 */


public class StringCheckRotationStringSame {

    public static void main(String[] args) {
        String string1 = "string";
        String string2 = "gnirts";

        checkTwoStringReverseSame(string1, string2);

    }

    public static void checkTwoStringReverseSame(String string1, String string2) {

        char[] stringArray = string1.toCharArray();
        int len = stringArray.length;
        List<Character> reverseList = new ArrayList<>();
        if(string1.length() == string2.length()) {
            for (int i = len - 1; i >= 0; i--) {
                reverseList.add(stringArray[i]);
            }
            String reverseString = "";
            for(char c: reverseList){
                reverseString = reverseString + c;
            }
            System.out.println(reverseString);
            if(Objects.equals(reverseString, string2)){
                System.out.println("String rotation is equal");
            } else{
                System.out.println("String rotation is not equal");
            }
        } else {
            System.out.println("string1 and string2 are not equal so there is nothing to proceed further");
        }
    }

}

