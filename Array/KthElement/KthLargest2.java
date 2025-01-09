package KthElement;

/* 

KthLargest with minHeap

minHeap: the root node is smaller than tha children node */

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargest2 {
    public static void main(String[] args) {
        
        int[] arr = {1,3,2,5,4} ; 

        int k = 2 ; // second largest number 

        PriorityQueue<Integer> minHeap = new PriorityQueue<>() ;    // minHeap 

        // adding elements to the minHeap

        for(int element: arr){
            minHeap.add(element) ; 
        }

        // System.out.println("\n Printing the minHeap elements: ");

        // while(!minHeap.isEmpty()){
        //     System.out.println(minHeap.peek());
        //     minHeap.poll() ; 
        // }

        for(int i=0; i <= k ; i++){
            minHeap.poll() ; 
        }

        int KthLargestElement = minHeap.peek() ; 

        System.out.println("Kth largest element: " + KthLargestElement);

    }    
}
