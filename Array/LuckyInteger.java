
/*
lucky integer is an integer that has frequency equal to its value. 

if there are two lucky integers, return the largest one, and if no lucky integer, return -1 
*/

import java.util.HashMap;
import java.util.Map;

public class LuckyInteger {
    public static void main(String[] args) {
     
    int[] nums = {1,2,2,3,3,3} ; 
    
    HashMap<Integer, Integer> frequency = new HashMap<>() ; 

        // adding elements to the hashmap 

    for(int element: nums){
        frequency.put(element, frequency.getOrDefault(element, 0) + 1) ;  
    }

        // printing element and their count 

    for(Map.Entry<Integer,Integer> entry: frequency.entrySet()){
        System.out.println("\n Key: " + entry.getKey() + " Value: " + entry.getValue() );
    }

    int luckyNumber = -1; 

    for(Map.Entry<Integer, Integer> entry : frequency.entrySet()){

        int key = entry.getKey() ; 
        int value = entry.getValue() ; 

        if(key == value){
            luckyNumber = Math.max(luckyNumber, key) ; 
        }
    }

    if(luckyNumber != -1){
        System.out.println("\n lucky number: " + luckyNumber);
    }
    else{
        System.out.println("\n lucky number not found");
    }

    }
}
