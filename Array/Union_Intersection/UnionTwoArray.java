package Union_Intersection;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class UnionTwoArray {
    public static void main(String[] args) {
        
        int[] arr1 = {1, 1, 1, 2, 2, 3, 3, 3} ;
        int[] arr2 = {3, 3, 3, 4} ; 

        // using hashset to store unique elements 

        Set<Integer> result = new HashSet<>() ; 

        // adding elements of first array to the hashset 

        for(int i=0 ; i < arr1.length ; i++){
            result.add(arr1[i]) ; 
        }

        // adding elements of second array to the hashset 

        for(int i=0 ; i < arr2.length ; i++){
            result.add(arr2[i]) ; 
        }

        // printing hashset 

        for(int element: result){
            System.out.print("\n" + element + " ");
        }

        System.out.println("printing hashset using iterator ");

        Iterator<Integer> iterator = result.iterator() ; 

        while(iterator.hasNext()){
            int element = iterator.next() ; 
            System.out.print("\n" + element + " ");
        }

    }
}
