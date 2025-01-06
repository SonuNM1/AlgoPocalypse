package Union_Intersection;
import java.util.HashSet;
import java.util.Set;

public class IntersectionTwoArray {
    public static void main(String args[]){

        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 2, 3, 5};

        int[] interElement = findIntersection(arr1, arr2) ;
        
        System.out.println("\n Intersection element: ");

        for(int num: interElement){
            System.out.print(num + " ");
        }

    }
    
    public static int[] findIntersection (int [] arr1, int [] arr2){

        Set<Integer> set1 = new HashSet<>() ; 

        for(int num: arr1){
            set1.add(num) ; 
        }

        Set<Integer> intersection = new HashSet<>() ; 

        for(int num: arr2){
            if(set1.contains(num)){
                intersection.add(num) ; 
            }
        }

        // converting the hashset back to array 

        int[] result = new int[intersection.size()] ; 

        int index = 0 ; 

        for(int num: intersection){
            result[index] = num ; 
            index++ ; 
        }

        return result ; 

    }

}
