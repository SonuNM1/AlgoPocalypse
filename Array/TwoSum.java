
/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to the target.
 */

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
    
        int[] arr = {2, 7, 11, 15} ;
        int target = 9 ; 

        Map<Integer, Integer> map = new HashMap<>() ; 

        for(int i=0 ; i < arr.length ; i++){

            int element = target - arr[i] ;        // calculate the complement  

            // check if the required element exists in the map 

            if(map.containsKey(element)){

                // print the indices and return 

                System.out.println("\n Indices: [" + map.get(element) + ", " + i + "]");
                return ;    // exit after finding solution  
            }

            // add the current element and its index to the map 

            map.put(arr[i], i) ; 
        }
        System.out.println("\n no solution found");

    }    
}
