public class CircularQueue {
    int queue[], MaxSize, front, rear, count; 

    void createQueue(int size) {
        MaxSize = size;
        rear = -1;
        front = 0;
        count = 0; 
        queue = new int[MaxSize];
    }

    void enqueue(int e) {
        
        rear = (rear + 1) % MaxSize; 
        queue[rear] = e;
        count++; 
    }

    int dequeue() {
        int temp = queue[front];
        
        front = (front + 1) % MaxSize; 
        count--; 
        return temp;
    }

    boolean is_full() {
        
        return count == MaxSize; 
    }

    boolean is_empty() {
        
        return count == 0; 
    }

    void print_queue() {
        int current = front;
        
        for(int i = 0; i < count; i++) {
            System.out.print(queue[current] + " - ");
            
            current = (current + 1) % MaxSize; 
        }
    }
}