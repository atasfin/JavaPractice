import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 6) How to reverse a given?
 * 7) How to reverse String without recursion?
 */

public class StringReverseString {

    public static void main(String[] args) {
        String string1 = "reversethisstring";
        reverseAString(string1);

    }

    public static void reverseAString(String string1) {

        char[] stringArray = string1.toCharArray();
        int len = stringArray.length;
        List<Character> reverseList = new ArrayList<>();

        for (int i = len - 1; i >= 0; i--) {
            reverseList.add(stringArray[i]);
        }
        String reverseString = "";
        for (char c : reverseList) {
            reverseString = reverseString + c;
        }
        System.out.println(reverseString);
    }
}
