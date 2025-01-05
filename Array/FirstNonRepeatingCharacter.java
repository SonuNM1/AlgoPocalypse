
/*
Find the first element in an array that appears only once. If all elements repeat, return a message indicating that no unique element exists.
 */

import java.util.Map ; 
import java.util.HashMap;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        
        int[] arr = {4, 5, 6, 7, 5, 4, 6, 8} ; 

        Map<Integer, Integer> frequencyCount = new HashMap<>() ; 

        for(int element: arr){
            frequencyCount.put(element, frequencyCount.getOrDefault(element, 0) +1 ) ; 
        }

        System.out.println("\n element and their count: ");

        for(Map.Entry<Integer, Integer> entry : frequencyCount.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        int firstRepeatingElement = 0 ; 

        for(int element: arr){
            if(frequencyCount.get(element) == 1){
                firstRepeatingElement = element ; 
                break ; 
            }
        }
        
        System.out.println("\n first non repeating element: " + firstRepeatingElement) ;

    }
}
