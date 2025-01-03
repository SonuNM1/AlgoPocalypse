
package duplicate_element ;

import java.util.HashSet;
import java.util.Iterator;

public class duplicateElement2{
    public static void main(String[] args) {
        
        // sorted array - multiple duplicate elements 

        int[] arr = {1,2,2,3,4,5,5} ; 

        HashSet<Integer> dupElements = new HashSet<>() ; 

        for(int i=0 ; i < arr.length ; i++){
            for(int j=i+1 ; j <= arr.length-1 ; j++){

                if(arr[i] == arr[j] && !dupElements.contains(arr[i])){
                    dupElements.add(arr[i]) ; 
                }
            }
        }

        System.out.println("\n Printing duplicate elements ");

        for(int element: dupElements){
            System.out.println(element);
        }

        System.out.println("\n Printing duplicate elements using iterator to iterate over the hashset");

        Iterator<Integer> iterator = dupElements.iterator() ; 

        while(iterator.hasNext()){
            int element = iterator.next();
            System.out.println(element);
        }

    }
}