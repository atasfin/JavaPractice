public class StringTestA {

    public static void main(String[] args) {

        char[] characterArray = {'a','b','d','e'};
        String stringArray = new String(characterArray);

        System.out.println(characterArray);
        System.out.println(stringArray);

        for(int i =0; i<=characterArray.length; i++){
            System.out.println(characterArray[i]);
        }

        for(int j =0; j<=stringArray.length(); j++){
            System.out.println(characterArray[j]);
        }

    }

}
