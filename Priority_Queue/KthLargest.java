package Priority_Queue;

// Kth largest using maxHeap

// see the implementation of minheap and maxheap first in heap folder

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargest {
    public static void main(String[] args) {

        // PriorityQueue<Integer> pq = new PriorityQueue<>() ;
        // pq.add(5) ;
        // pq.add(15) ;
        // pq.add(10) ;

        // System.out.println(pq.size());

        // while(!pq.isEmpty()){
        // System.out.println(pq.peek());
        // pq.poll() ;
        // }

        int[] arr = { 20, 10, 60, 30, 50, 40 };

        int k = 3; // third largest element (40)

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()) ; 

        // adding elements to the maxHeap 

        for(int nums: arr){
            maxHeap.add(nums) ; 
        }

        // extracting elements 

        for(int i=0 ; i < k-1 ; i++){
            maxHeap.poll() ; 
        }

        // now the root of the maxHeap will be the k-th largest element 

        int kthLargestElement = maxHeap.peek() ; 

        System.out.println("\n Kth largest element: " + kthLargestElement);

    }
}

/* 
  
  peek() - retrieves the highest-priority element without removing it from the
  PriorityQueue.
  
  Returns 'null' if the queue is empty.
  
  It's used only when you need to check the top element without altering the
  queue.
  
  poll() - retrieves and remvoes the highest-priority element from the priority
  queue.
  
  Returns 'null' if the queue is empty.
  
  Modifies the queue by removing the top element.
  
  It's used when you need to process and remove the top element (in Dijkstra)
  
 */
