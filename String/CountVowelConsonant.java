package String;

public class CountVowelConsonant {
    public static void main(String[] args) {
        
        String str = "myself sonu" ; 
        String vowel = "aeiou" ; 
        int countVowel = 0, countConsonant = 0 ; 

        for(int i=0 ; i < str.length()-1 ; i++){
            
            char strCh = str.charAt(i) ; // m
            strCh = Character.toLowerCase(strCh) ; 

            if(Character.isLetter(strCh)){

                if(vowel.indexOf(strCh) != -1){
                    countVowel++ ; 
                }
                else{
                    countConsonant++ ; 
                }
            }
        }

        System.out.println("\n Vowel count: " + countVowel);

        System.out.println("\n Consonant count: " + countConsonant);
    }    
}

/* 

indexOf() - used to find the index of the first occurence of a specified character or substring withing a string. 
            It returns the index of the character or substring, if not found then returns - 1

*/