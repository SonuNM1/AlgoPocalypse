package Union_Intersection;

import java.util.HashSet;
import java.util.Set;

public class IntersectionTwoElement2 {
    public static void main(String[] args) {
        
        int[] arr1 = {1,2,2,1} ; 
        int[] arr2 = {2,2} ; 

        Set<Integer> intersection = new HashSet<>() ; 

        for(int i=0 ; i < arr1.length ; i++){
            for(int j=0 ; j < arr2.length ; j++){

                if(arr1[i] == arr2[j]){
                    intersection.add(arr1[i]) ; 
                }
            }
        }

        System.out.println("\n intersection OR common element: ");

        for(int num: intersection){
            System.out.print(num + " ");
        }

    }
}
