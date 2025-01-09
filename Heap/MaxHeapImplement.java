package Heap;
import java.util.PriorityQueue;
import java.util.Collections ; 

public class MaxHeapImplement {
    public static void main(String[] args) {
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()) ; 

        maxHeap.add(1); 
        maxHeap.add(5); 
        maxHeap.add(6); 
        maxHeap.add(2); 
        maxHeap.add(3); 

        while (!maxHeap.isEmpty()) {
            System.out.println("\n" + maxHeap.peek());
            maxHeap.poll() ; 
        }

    }
}

// max-heap: the parent node is always greater than or equal to the child node