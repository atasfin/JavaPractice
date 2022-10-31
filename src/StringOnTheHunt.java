import java.util.*;

public class StringOnTheHunt {
    public static void main(String []args){

        String str1 = "abcde";
        char charInput[] = str1.toCharArray();
        List<String> listOfString = new ArrayList<>(Arrays.asList("d", "a", "f", "g", "e"));
        char[] chars = listOfString.toString().toCharArray();
        System.out.println(chars);
        List<String> finalMatch = new ArrayList<>();

        String csv = "d,a,g,e,b";
        List<String> csvList = new ArrayList<String>(Arrays.asList(csv.split(",")));
        char[] chars2 = csvList.toString().toCharArray();
        System.out.println(chars2);
        Map<String,Integer> map = new HashMap<>();

        System.out.println(listOfString);
        for(String s : listOfString){
            System.out.println(s);
        }

        for(Character item: charInput){
            if(map.containsKey(item)){
                map.put(String.valueOf(item), map.get(item) + 1);
            } else {
                map.put(String.valueOf(item), 1);
            }
        }

        for(String item2: listOfString){
            if(map.containsKey(item2)){
                map.put(String.valueOf(item2), map.get(item2) + 1);
            } else {
                map.put(String.valueOf(item2), 1);
            }
        }

        for(String strvalue: csvList){
            if(map.containsKey(strvalue)){
                map.put(String.valueOf(strvalue), map.get(strvalue) + 1);
            } else {
                map.put(String.valueOf(strvalue), 1);
            }
        }

        System.out.println(map);

        for(Map.Entry<String, Integer> entry: map.entrySet()){
            if(entry.getValue() >=3){
                finalMatch.add(entry.getKey());
            }
        }

        System.out.println(finalMatch);
        String finalString = "";
        for(String str2 : finalMatch){
            finalString += str2;
        }
        System.out.println(finalString);

    }

}
