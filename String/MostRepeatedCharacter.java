import java.util.HashMap;
import java.util.Map;

public class MostRepeatedCharacter {
    public static void main(String[] args) {
        
        String input = "Sonu NM" ; 
        input = input.toLowerCase() ; 

        HashMap<Character, Integer> inputMap = new HashMap<>() ; 

        for(char ch : input.toCharArray()){
            inputMap.put(ch, inputMap.getOrDefault(ch, 0)+1) ; 
        }

        System.out.println("\n Character with their frequency: ");

        for(Map.Entry<Character, Integer> entry : inputMap.entrySet()){
            char key = entry.getKey() ; 
            int value = entry.getValue() ; 

            System.out.println("\n" + key + " : " + value);
        }

        int maxCharCount = Integer.MIN_VALUE ; 
        char maxChar = ' ' ; 

        for(Map.Entry<Character, Integer> entry : inputMap.entrySet()){

            if(entry.getValue() > maxCharCount){
                maxCharCount = entry.getValue() ;
                maxChar = entry.getKey() ; 
            }
        }

        if(maxChar != ' '){
            System.out.println("\n most repeated character: " + maxChar + ", Repeated: " + maxCharCount + " times");
        }
        else{
            System.out.println("\n not found");
        }

    }    
}
