
- A Linked list is a linear data structure where elements (nodes) are stored in a non-contiguous memory location. 

    Each node contains: 

        1. Data (value of the node)
        2. Pointer (reference) to the next node 

Unlike arrays, linked lists provide memory allocation, meaning the size can grow or shrink dynamically. 

- Types of Linkd lists 

    1. Singly Linked List (SLL)

        Each node contains data and a reference to the next node. 

        🔹 Traversal is one-directional (forward only)
        🔹 Insertion & Deletion are efficient 
        🔹 Better accessing of elements  

        [10|*] → [20|*] → [30|*] → [null]


    2. Doubly Linked List (DLL)

        Each node contains: Data, Reference to the previous node, Reference to the next node 

        🔹 Traversal is bidirectional 
        🔹 More flexible but consumes extra memory 

        null ← [10|*|*] ↔ [20|*|*] ↔ [30|*|*] → null


    3. Circular Linked List (CLL)

        A circular linked list forms a loop: 

        Singly Circular - Last node points to the first node 

        Doubly Circular - Last node points to the first, and first to the last. 

         [10|*] → [20|*] → [30|*] → (points back to 10)


- Operation on Linked List 

    1. Insertion : At the beginning, At the end, At a specific position 

    2. Deletion : From the beginning, From the end, From a specific position 

    3. Searching : Find a node by value 

    4. Traversal : Iterate through all elements 
