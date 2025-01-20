package duplicate_element;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        
        // remove duplicate elements from sorted array - by creating a temp array 

        int[] sortedArray = {1, 2, 2, 3, 4, 5, 5} ; 

        int[] temp = new int[sortedArray.length] ; 
        int index = 0 ;

        for(int i=0 ; i < sortedArray.length -1 ; i++){
            if(sortedArray[i] != sortedArray[i+1]){
                temp[index] = sortedArray[i] ; 
                index ++ ; 
            }
        }

        temp[index] = sortedArray[sortedArray.length-1] ; 

        System.out.println("\n array without dupliate element : ");

        for(int element: temp){
            System.out.print(element + " ");
        }

        

        HashSet<Integer> uniqueElement = new HashSet<>() ; 

        for(int i=0 ; i < sortedArray.length ; i++){
            if(!uniqueElement.contains(sortedArray[i])){
                uniqueElement.add(sortedArray[i]) ; 
            }
        }

        System.out.println("\n printing with hashset");

        for(int element: uniqueElement){
            System.out.print(element + " ");
        }
        
        
    }
}
