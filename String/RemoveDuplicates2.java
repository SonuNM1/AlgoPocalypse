// Using HashSet to remove duplicates and identify duplicates

package String;

import java.util.HashSet;

public class RemoveDuplicates2 {
    public static void main(String[] args) {
        
        String input = "Ssonu";
        input = input.toLowerCase(); // Convert input to lowercase

        HashSet<Character> seenCharacters = new HashSet<>(); // To track seen characters
        HashSet<Character> duplicateCharacters = new HashSet<>(); // To track duplicates

        StringBuilder uniqueCharacters = new StringBuilder(); // To store input without duplicates

        // Iterate through each character in the input
        for (char ch : input.toCharArray()) {
            if (!seenCharacters.contains(ch)) {
                seenCharacters.add(ch); // Add to set of seen characters
                uniqueCharacters.append(ch); // Append to result for unique characters
            } else {
                duplicateCharacters.add(ch); // Add to duplicates if already seen
            }
        }

        // Print input without duplicates
        System.out.println("\nInput without duplicates: " + uniqueCharacters);

        // Print duplicates
        System.out.println("\nDuplicate characters: ");
        for (char ch : duplicateCharacters) {
            System.out.println(ch);
        }
    }
}