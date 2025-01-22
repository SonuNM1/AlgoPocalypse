package String;

/*
Given an input string and ordering string, need to return true if the ordering string is present in Input string.
input = “hello world!”
ordering = “hlo!”
result = FALSE (all Ls are not before all Os)

input = “hello world!”
ordering = “!od”
result = FALSE (the input has ‘!’ coming after ‘o’ and after ‘d’, but the pattern needs it to come before ‘o’ and ‘d’)

input = “hello world!”
ordering = “he!”
result = TRUE

This problem involves checking if the characters in the ordering string appear in the same relative order in the input string, regardless of their exact positions or the presence of other characters.

*/

public class StringOrder {
    public static void main(String[] args) {
        
        String input = "hello world!" ; 
        String ordering = "!od" ; 

        int orderIndex = 0 ; 
        boolean order = false ; 

        for(int i=0 ; i < input.length() ; i++){

            if(input.charAt(i) == ordering.charAt(orderIndex)){
                orderIndex ++ ; 
            }

            if(orderIndex == ordering.length()){
                order = true ; 
            }
        }

        if(order){
            System.out.println("\n same order");
        }
        else{
            System.out.println("\n not in same order");
        }

    }
}
