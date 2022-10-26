/**
 * 1) How to find the maximum occurring character in a given String?
 * *
 */

public class StringCount {

    public static void main(String[] args){

        String inputString = "A series of string has provided";
        char [] inputChar = inputString.toCharArray();
        char findCount = ' ';
        int count = 0;
        for(int i=0; i<inputString.length(); i++){
            if(findCount == inputChar[i]){
                count++;
            }
        }
        System.out.println("Number of occurrence in the of " + findCount + " is::" + count);
    }

}
