
// Using HashMap

package String ;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RemoveDuplicates{
    public static void main(String[] args) {
        
        String input = "Ssonu" ;
        input = input.toLowerCase() ; 

        HashMap<Character, Integer> inputMap = new HashMap<>() ; 

        for(char ch: input.toCharArray()){
            inputMap.put(ch, inputMap.getOrDefault(ch, 0)+1) ; 
        }

        System.out.println("\n Printing each character and its frequency: ");

        for(Map.Entry<Character, Integer> entry : inputMap.entrySet()){
            System.out.println("\n Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

        System.out.println("\n Iterating over hashmap by iterator");

        Iterator<Map.Entry<Character, Integer>> iterator = inputMap.entrySet().iterator() ; 

        while (iterator.hasNext()) {
            Map.Entry<Character, Integer> entry = iterator.next() ; 

            System.out.println("\n Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

        // adding the unique elements (character with frequency 1) to StringBuilder 

        StringBuilder unique = new StringBuilder() ; 

        for(char ch: input.toCharArray()){
            if(inputMap.get(ch) == 1){
                unique.append(ch) ; 
            }
        }

        System.out.println("unique elements: " + unique);

    }
}