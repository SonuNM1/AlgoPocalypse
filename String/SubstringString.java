
/*
Check if a String is a substring of another string

Given two strings, s1 and s2, determine whether s1 is a substring of s2. 

A string s1 is considered a substring of s2 if s1 appears in s2 consecutively and in the same order.
*/

public class SubstringString {
    public static void main(String[] args) {
        
        String s1 = "abc" ; 
        String s2 = "abcdef" ; 

        int l1 = s1.length() ; 
        int l2 = s2.length() ; 

        // if s1 is longer than s2, it cannot be a substring 

        if(l1 > l2){
            return ; 
        }

        // sliding window to check for substring 

        for(int i=0 ; i <= l2-l1 ; i++){
            String sub = s2.substring(i, i+l1) ;    // extract substring of size l1

            if(sub.equals(s1)){
                System.out.println("\n substring");
                break ; 
            }
        }

        System.out.println("\n not a substring");

    }
}
