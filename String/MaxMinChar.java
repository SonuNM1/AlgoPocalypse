
/*
Write a program to find the maximum occurring character and the minimum occurring character in a given string. Ignore spaces and special characters, and consider only alphabetic characters. If there are multiple characters with the same maximum or minimum frequency, return any one of them.
*/

import java.util.HashMap;
import java.util.Map;

public class MaxMinChar {
    public static void main(String[] args) {
        
        String input = "Sonu NM" ;
        input = input.toLowerCase() ; 

        if(input.isEmpty()){
            System.out.println("\n The string contains no valid characters.");
            return ; 
        }

        HashMap<Character, Integer> inputMap = new HashMap<>() ; 

        for(char ch : input.toCharArray()){
            if(ch != ' ' && ch >= 'a' && ch <= 'z'){        // ignore spaces 
                inputMap.put(ch, inputMap.getOrDefault(ch, 0) + 1) ; 
            }
        }

        System.out.println("\n Printing character and their counts: ");

        for(Map.Entry<Character, Integer> entry : inputMap.entrySet()){
            char key = entry.getKey() ; 
            int value = entry.getValue() ;

            System.out.println(key + " : " + value);
        }

        // initialize variables to store the max and min occuring character 

        char maxChar = ' ' ; 
        char minChar = ' ' ; 

        int maxCount = Integer.MIN_VALUE ; 
        int minCount = Integer.MAX_VALUE ; 

        // finding the max and min frequency characters 

        for(char ch : inputMap.keySet()){
            int freq = inputMap.get(ch) ; 

            if(freq > maxCount){
                maxCount = freq ; 
                maxChar = ch ; 
            }

            if(freq < minCount){
                minCount = freq ; 
                minChar = ch ; 
            }
        }

        System.out.println("\n Maximum occuring character: " + maxChar + " (Frequency: " + maxCount + ")");
        System.out.println("\n Minimum occuring character: " + minChar + " (Frequency: " + minCount + ")");

    }
}
