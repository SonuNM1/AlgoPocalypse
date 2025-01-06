package Union_Intersection;

import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class IntersectionThreeArray {
    public static void main(String[] args) {
        
        // three input arrays

        int[] num1 = {1,2,3,4} ; 
        int[] num2 = {2,3} ; 
        int[] num3 = {2,3,5,7} ; 

        List<Integer> intersection = commonElements(num1, num2, num3) ; 

        System.out.println("\n intersection elements: " + intersection);

    }

    public static List<Integer> commonElements(int[] arr1, int[] arr2, int[] arr3){

        List<Integer> result = new ArrayList<>() ; 

        int i=0, j=0, k=0 ; 

        while(i < arr1.length && j < arr2.length && k < arr3.length){

            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                
                result.add(arr1[i]) ; 

                i++ ; 
                j++ ; 
                k++ ;

            }
            else if(arr1[i] < arr2[j]){
                i++ ; 
            }
            else if(arr2[j] < arr3[k]){
                j++ ; 
            }
            else{
                k++ ; 
            }

        }

        return result ; 

    }
}
