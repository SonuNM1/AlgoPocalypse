package String;

public class CountVowelConsonant2 {
    public static void main(String[] args) {
        
        String name = "myself sonu" ; 
        String vowels = "aeiou" ; 
        int countVowel = 0 , countConsonant = 0 ; 

        for(int i=0 ; i < name.length() ; i++){
            char ch = name.charAt(i) ; 

            ch = Character.toLowerCase(ch) ; 

            // check if the string is a letter 

            if(ch >= 'a' && ch <= 'z'){

                // check if it's a vowel 

                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    countVowel++ ; 
                }
                else{
                    countConsonant++ ; 
                }
            }
        }

        System.out.println("vowel count: " + countVowel);
        System.out.println("consonant count: " + countConsonant);

    }
}
