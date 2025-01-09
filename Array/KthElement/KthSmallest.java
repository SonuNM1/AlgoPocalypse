package KthElement;

import java.util.PriorityQueue;

public class KthSmallest {
    public static void main(String[] args) {
        
        int[] arr = {1,3,2,5,4} ; 
        int k = 2 ; // second smallest element (2)

        PriorityQueue<Integer> minHeap = new PriorityQueue<>() ;    // minHeap - the root nodes is smaller than or equal to the children node  

        // adding elements to the minHeap 

        for(int element: arr){
            minHeap.add(element) ; 
        }

        // System.out.println("\n Printing minHeap elements: ");

        // while(!minHeap.isEmpty()){
        //     System.out.println(minHeap.peek());
        //     minHeap.poll() ; 
        // }

        for(int i = 0 ;  i < k-1 ; i++){
            minHeap.poll() ; 
        }        

        int KthSmallestElement = minHeap.peek() ; 

        System.out.println(k + " \n smallest element is: " + KthSmallestElement);

    }
}
