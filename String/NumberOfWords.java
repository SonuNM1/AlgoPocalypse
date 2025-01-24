public class NumberOfWords {
    public static void main(String[] args) {
        
        String words = " This is a simple string with several words " ; 
        words = words.trim() ; // remove leading and trailing space 

        if(words.isEmpty()){
            System.out.println("\n number of words = 0");
            return ; 
        }

        String[] wordsArray = words.split(" ") ; 

        int wordCount = wordsArray.length ; 

        System.out.println("\n Number of words: " + wordCount);

    }
}
