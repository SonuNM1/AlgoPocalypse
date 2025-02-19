
/*
Given two strings, s1 and s2, determine if s1 is a subsequence of s2. 

A string s1 is a subsequence of s2 if all characters of s1 appear in s2 in the same order, but not necessarily consecutively.

*/


public class SubsequenceString {
    public static void main(String[] args) {
     
        String s1 = "abc" ; 
        String s2 = "ahdbfc" ; // output should be true as all the characters of s1 are in s2 
        
        int i = 0 ; 
        int j = 0 ;
        
        while(i < s1.length() && j < s2.length()){
            if(s1.charAt(i) == s2.charAt(j)){
                i++ ;   // move the s1 poiter when characters match
            }
            j++ ;   // always move the s2 pointer 
        }

        if(i == s1.length()){
            System.out.println("\n subsequence");
        }
        else{
            System.out.println("\n not subsequence");
        }
    }
}
