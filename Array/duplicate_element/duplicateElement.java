package duplicate_element ; 

import java.util.HashSet ;
import java.util.Iterator; 

public class duplicateElement {
    public static void main(String[] args) {

        // Sorted array - only one duplicate element

       /* 
        int[] sortedArr = { 1, 2, 2, 3, 4, 5 };
        int count = 0;

        for (int i = 0; i < sortedArr.length - 1; i++) {
            if (sortedArr[i] == sortedArr[i + 1]) {
                System.out.println("Duplicate element: " + sortedArr[i]);
            }
        }
        */

        // Sorted array - multiple duplicate elements 

        int[] sortedArr = {1,2,2,3,3,4,5} ; 

        HashSet<Integer> duplicateElement = new HashSet<>() ;         

        for(int i= 0 ; i < sortedArr.length ; i++){
            for(int j=i+1 ; j <= sortedArr.length-1 ; j++){

                if((sortedArr[i] == sortedArr[j]) && (!duplicateElement.contains(sortedArr[i]))){
                    System.out.println(sortedArr[i]);
                    duplicateElement.add(sortedArr[i]) ; 
                }

            }
        }

        System.out.println("\n printing unique element from hashset: ");

        for(int unique: duplicateElement){
            System.out.print(unique + " ");
        }

        // iterating using iterator 

        System.out.println("\n iterating using iterator: ");

        Iterator<Integer> iterator = duplicateElement.iterator() ; 

        while(iterator.hasNext()){
            int element = iterator.next() ; 
            System.out.print(element + " ");
        }

    }
}
