public class PriorityQueue {
    int queue[], MaxSize, front, rear;
    
    void createQueue(int size) {
        MaxSize = size;
        rear = -1;
        front = 0;
        queue = new int[MaxSize];
    }
    
    // Modified to insert elements based on priority (Descending order)
    void enqueue(int e) {
        // --- NEW FIX: Reclaim space if there are empty spots at the front ---
        if (rear == MaxSize - 1 && front > 0) {
            int shift = front;
            for (int i = front; i <= rear; i++) {
                queue[i - shift] = queue[i];
            }
            front = 0;
            rear = rear - shift;
        }

        // Standard full check
        if (is_full()) {
            System.out.println("Queue is full!");
            return;
        }

        if (is_empty()) {
            queue[++rear] = e;
        } else {
            int i;
            // Shift smaller elements to the right to make room for the new element
            for (i = rear; i >= front; i--) {
                if (e > queue[i]) {
                    queue[i + 1] = queue[i];
                } else {
                    break;
                }
            }
            queue[i + 1] = e;
            rear++;
        }
    }

    boolean is_full() {
        return (rear == MaxSize - 1); // boundary condition
    }
    
    int dequeue() {
        if (is_empty()) {
            System.out.println("Queue is empty!");
            return -1; 
        }
        // Removes element from front (which is now guaranteed to be the highest priority)
        return queue[front++];
    }

    boolean is_empty() {
        return front > rear;
    }
    
    void print_queue() {
        if (is_empty()) {
            System.out.println("Queue is empty.");
            return;
        }
        for(int i = front; i <= rear; i++) {
            System.out.print(queue[i] + (i == rear ? "" : " - "));
        }
        System.out.println();
    }
}