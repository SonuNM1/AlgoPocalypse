
/*
Given a two strings, determine if one is a circular permutation of the other or not. For example abcd, cdab are circular permutations

To determine if one string is a circular permutation of another, the main idea is that if you concatenate one string with itself, the resulting sring will contain all possible permutations of the original string as its substring. 

If s1 = "abcd" and s2 = "cdab", then concatenating s1 with itself gives "abcdabcd". We can see that "cdab" is a substring of this result, so it is a circular permutation of s1.
*/

public class CircularPermutations {
    public static void main(String[] args) {
        
        String s1 = "abcd" ;
        String s2 = "cdab" ; 

        String temp = s1 ; 

        if(s1.length() != s2.length()){
            return ; 
        }

        s1 = s1.concat(s1) ; 

        // System.out.println("\n" + s1);

        if(s1.contains(s2)){
            System.out.println("\n" + s2 + " is a circular permutation of: " + temp);
        }
        else{
            System.out.println("\n" + s2 + " isn't a circular permutation of: " + temp); 
        }

    }
}
