import java.util.Scanner;

public class QueuePr {
    int[] arr;
    int front = -1;
    int rear = -1;
    int size;

    QueuePr(int size){
        this.size = size;
        arr = new int[size];
    }
    boolean isEmpty(){
        return front == -1;
    }

    boolean isFull(){
        return ((rear + 1)% size == front);
    }

    void enqueue(int val){
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (isEmpty()) {
            front = 0;
            rear = 0;
        }else{
            rear = (rear + 1)% size; 
        }
        arr[rear] = val;
    }

    void dequeue(){
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        int val = arr[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        }else{
            front = (front +1)% size;
            
        }
        System.out.println("dequeue" + val);
    }

    void display(){
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        int i = front;
        while (true) {
            System.out.println(arr[i]+ " ");
            if (i == rear) {
                break;
            }
            i = (i+1)%size;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int elem;
        int choice, e;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr Size in no: ");
        elem = sc.nextInt();
        QueuePr obj = new QueuePr(elem);

        do {
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("0. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter element: ");
                    e = sc.nextInt();
                    obj.enqueue(e);
                    break;
                case 2:
                    obj.dequeue();
                    break;
                case 3:
                    obj.display();
                    break;
                case 0:
                    break;
                default:
                    break;
            }

        } while (choice!= 0);
        sc.close();
    }
}
