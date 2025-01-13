package String;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        
        String str = "racing car" ; 
        str = str.toLowerCase() ; 

        Map<Character, Integer> strMap = new HashMap<>() ; 

        // traversing through each character of the given string, and storing their frequency inside the hashmap 

        for(char ch : str.toCharArray()){
            strMap.put(ch, strMap.getOrDefault(ch, 0) + 1) ; 
        }

        System.out.println("\n Printing character and their count");

        for(Map.Entry<Character, Integer> entry : strMap.entrySet()){
            System.out.println(" \n Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

        for(char element : str.toCharArray()){
            if(strMap.get(element) == 1){
                System.out.println("\n first non-repeating character: " + element);
            }
        }

        System.out.println("\n no non-repeating character found");
    }
}
