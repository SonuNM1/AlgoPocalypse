public class CountVowelConsonant2 {
    public static void main(String[] args) {
        
        String input = "Sonu NM" ; 
        input = input.toLowerCase() ; 

        String vowels = "aeiou" ; 

        int vowelCount = 0, consonantCount = 0 ; 

        for(int i=0 ; i < input.length() ; i++){
            char ch = input.charAt(i) ; 

            if(ch >= 'a' && ch <= 'z'){
                if(vowels.indexOf(ch) != -1){
                    vowelCount++ ; 
                }
                else{
                    consonantCount++ ; 
                }
            }
        }

        System.out.println("\n Vowel count: " + vowelCount + " Consonant count: " + consonantCount);

    }
}
