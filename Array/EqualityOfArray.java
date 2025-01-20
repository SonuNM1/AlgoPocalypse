public class EqualityOfArray {
    public static void main(String[] args) {
        
        int num1[] = {1,2,3,4,5} ; 
        int num2[] = {1,5,3,4,5} ;

        boolean equality = true ; 

        if(num1.length != num2.length){
            equality = false ; 
        }
        else{
            for(int i=0 ; i < num1.length ; i++){
                if(num1[i] != num2[1]){
                    equality = false ; 
                    break ; 
                }
            }
        }

        if(equality){
            System.out.println("\n array equal");
        }
        else{
            System.out.println("\n array not equal");
        }

    }
}
