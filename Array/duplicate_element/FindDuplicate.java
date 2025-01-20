package duplicate_element;

import java.util.HashSet;

public class FindDuplicate {
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 2, 3, 3, 4} ; 

        HashSet<Integer> uniqueElement = new HashSet<>() ; 
        HashSet<Integer> duplicateElement = new HashSet<>() ; 

        for(int i=0 ; i < arr.length ; i++){
            if(!uniqueElement.add(arr[i])){
                duplicateElement.add(arr[i]) ; 
            }
        }

        System.out.println("\n unique element: ");

        for(int unique: uniqueElement){
            System.out.print(unique + " ");
        }

        System.out.println("\n duplicate elements: ");

        for(int duplicate: duplicateElement){
            System.out.print(duplicate + " ");
        }

    }
}
