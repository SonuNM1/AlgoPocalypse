import java.util.List;
import java.util.ArrayList;

public class AlternatePosNeg {
    public static void main(String[] args) {
        
        int[] arr = {-1, -5, 4, 7, 1, -2, 0} ; 

        int[] result = new int[arr.length] ; 

        List<Integer> positive = new ArrayList<>() ; 
        List<Integer> negative = new ArrayList<>() ; 

        for(int element: arr){
            if(element < 0){
                negative.add(element) ; 
            }
            else{
                positive.add(element) ; 
            }
        }

        int i = 0 , positiveIndex = 0 , negativeIndex = 0 ; 

        while((positiveIndex < positive.size()) && (negativeIndex < negative.size())){

            result[i] = positive.get(positiveIndex) ; 
            i++ ; 
            positiveIndex++ ; 

            result[i] = negative.get(negativeIndex) ; 
            i++ ; 
            negativeIndex ++ ; 
        }

        // appending other remaining elements to the result 

        while(positiveIndex < positive.size()){
            result[i] = positive.get(positiveIndex) ;
            i++ ; 
            positiveIndex ++ ; 
        }

        while(negativeIndex < negative.size()){
            result[i] = negative.get(negativeIndex) ; 
            i++ ; 
            negativeIndex ++ ; 
        }

        System.out.println("\n elements at alteranate pos and neg positions: ");

        for(int num : result){
            System.out.print(num + " ");
        }

    }
}
