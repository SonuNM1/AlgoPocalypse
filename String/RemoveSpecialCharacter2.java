public class RemoveSpecialCharacter2 {
    public static void main(String[] args) {
        
        String input = "Hello, World! @2025 #Java$Programming%";

        System.out.println("\n Original string: " + input);

        String cleanedString = "" ; 

        for(int i=0 ; i < input.length() ; i++){
            char c = input.charAt(i) ; 

            // check if the character is a letter , digit or space 

            if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9') || c == ' '){
                cleanedString += c ; 
            }
        }

        System.out.println("\n Cleaned string: " + cleanedString);


    }
}
