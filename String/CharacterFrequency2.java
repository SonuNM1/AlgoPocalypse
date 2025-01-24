public class CharacterFrequency2 {
    public static void main(String[] args) {
        
        String input = " several words " ;
        input = input.toLowerCase().trim() ;

        int l1 = input.length() ; 

        String character = "r" ;

        int l2 = input.replaceAll(character, "").length() ; 

        int count = l2 - l1 ; 

        System.out.println("\n count: " + count);

    }
}
