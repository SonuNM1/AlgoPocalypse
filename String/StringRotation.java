
/*
Check if one string is a rotation of another string. For example, "waterbottle" is a rotation of "erbottlewat". 

The method should return true if the second string is a rotation of the first, and false otherwise.
 */

public class StringRotation {
    public static void main(String[] args) {
        
        String str1 = "waterbottle" ; 
        String str2 = "erbottlewat" ; 

        // step 1 : if length of both string aren't equal, they are not rotation of each other 

        if(str1.length() != str2.length()){
            return ; 
        }

        // concat first string with itself 

        String concat = str1 + str1 ; 

        if(concat.contains(str2)){
            System.out.println("\n rotation of each other");
        }
        else{
            System.out.println("\n not a rotation");
        }

    }
}
