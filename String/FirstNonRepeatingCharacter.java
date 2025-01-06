package String;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        
        String input = "racing car" ; 
        input = input.toLowerCase() ; 

        HashMap<Character, Integer> inputMap = new HashMap<>(); 

        for(char ch: input.toCharArray()){
            inputMap.put(ch, inputMap.getOrDefault(ch, 0)+1) ; 
        }

        // System.out.println("\n Character and their count: ");

        // for(Map.Entry<Character, Integer> entry: inputMap.entrySet()){
        //     System.out.println("\n Key: " + entry.getKey() + " Value: " + entry.getValue());
        // }

        for(char element: input.toCharArray()){
            if(inputMap.get(element) == 1){
                System.out.println("\n first non-repeating character: " + element);
                break ; 
            }
        }

        System.out.println("\n No non-repeating character found");

    }
}
