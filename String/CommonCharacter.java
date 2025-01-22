package String;

import java.util.HashSet;

/*
common substring can be a character of length = 1 as well 
*/

public class CommonCharacter {
    public static void main(String[] args) {
        
        String s1 = "hello" ; 
        String s2 = "world" ; 

        boolean found = false ; 

        HashSet<Character> charSet = new HashSet<>() ; 

        // adding all characters of s1 to the hashset

        for(char ch: s1.toCharArray()){
            charSet.add(ch) ; 
        }

        // checking if any character in s2 exists in the set 

        for(char ch: s2.toCharArray()){
            if(charSet.contains(ch)){
                found = true ; 
            }
        }

        if(found){
            System.out.println("\n common element found");
        }
        else{
            System.out.println("\n no common element found");
        }

    }
}
