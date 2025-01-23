public class CountVowelConsonant {
    public static void main(String[] args) {
        
        String word = "sonu" ; 

        int vowelCount = 0 , consonantCount = 0 ; 

        word = word.toLowerCase().trim() ; 

        for(char ch : word.toCharArray()){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowelCount++ ; 
            }
            else if(ch >= 'a' || ch <= 'z'){
                consonantCount++ ; 
            }
        }

        System.out.println("\n Vowel count: " + vowelCount + " Consonant count: " + consonantCount);

    }
}
