
/*
Given a string, the task is to remove all special characters from it, leaving only alphanumeric characters (letters and numbers) and spaces.
*/

public class RemoveSpecialCharacter {
    public static void main(String[] args) {
        String input = "Hello, World! @2025 #Java$Programming%" ;
        
        System.out.println("\n Original string: " + input);

        String regex = "[^a-zA-Z0-9]" ; 

        String cleanedString = input.replaceAll(regex, "") ; 

        System.out.println("\nCleaned string: " + cleanedString);
    }
}
