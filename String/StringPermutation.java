package String;

import java.util.HashSet;

public class StringPermutation {
    public static void main(String[] args) {
        
        String input = "abc" ; // ['a', 'ab', 'abc', 'b', 'bc', 'c']

        HashSet<String> unique = new HashSet<>() ; 

        for(int i=0 ; i < input.length() ; i++){
            for(int j=i+1 ; j <= input.length() ; j++){
                String subString = input.substring(i, j) ; 

                unique.add(subString) ; 
            }
        }

        System.out.println("\nall substring or permutations of string: ");

        for(String element: unique){
            System.out.print(element + " ");
        }

    }
}
