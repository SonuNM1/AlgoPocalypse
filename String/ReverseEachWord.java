public class ReverseEachWord {
    public static void main(String[] args) {
        
        String input = "Sonu NM" ; 

        // output -> unoS MN

        String[] inputArr = input.split(" ") ; 

        System.out.println("\n Required string: ");

        for(String element : inputArr){
            for(int i=element.length()-1 ; i >= 0 ; i--){
                System.out.print(element.charAt(i));
            }
            System.out.println();
        }



    }
}
