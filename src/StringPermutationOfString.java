/**
 * 8) How to print all permutation of a String? *
 *
 */

public class StringPermutationOfString {

    public static void main(String []args){

        String string1 = "abc";
        int n = string1.length();
        StringPermutationOfString stringPermutationOfString = new StringPermutationOfString();
        stringPermutationOfString.generatePermutation(string1, 0, n-1);

    }

    public void generatePermutation(String str, int left, int right){

        if(left == right){
            System.out.println(str);
        } else {
            for(int i=left; i<= right; i++){
                String swapped = this.swap(str, left, i);
                this.generatePermutation(swapped, left+1, right);
            }
        }
    }

    public static String swap(String str, int left, int right){
        char temp;
        char charArray [] = str.toCharArray();
        temp = charArray[left];
        charArray[left] = charArray[right];
        charArray[right] = temp;
        return String.valueOf(charArray);

    }
}
