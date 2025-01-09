package Heap;

import java.util.PriorityQueue;

public class MinHeapImplement {
    public static void main(String[] args) {
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>() ; 

        minHeap.add(5) ; 
        minHeap.add(1) ; 
        minHeap.add(7) ; 
        minHeap.add(6) ; 

        while(!minHeap.isEmpty()){
            System.out.println("\n" +minHeap.peek());
            minHeap.poll() ; 
        }

    }
}

// min-heap : the value of parent node is always less than or equal to its children 