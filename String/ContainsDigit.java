
public class ContainsDigit{
    public static void main(String[] args) {
        
        String input = "Hello123World" ; 

        boolean containsDigit = false ; 

        for(char ch: input.toCharArray()){
            if(Character.isDigit(ch)){
                containsDigit = true ; 
                break ; 
            }
        }

        if(containsDigit){
            System.out.println("\n String contains digit");
        }
        else{
            System.out.println("\n String doesn't contains digit");
        }

    }
}