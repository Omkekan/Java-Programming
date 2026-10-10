import java.util.Scanner;

public class Dynamic_Queue {

    // Add the missing Node class
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node front, rear; // Track both ends of the queue

    // insert right
    void enqueue(int data) {
        Node n = new Node(data);
        if (rear == null) // on first
            front = rear = n;
        else {
            rear.next = n;
            rear = n;
        }
    }

    // delete left
    void dequeue() {
        if (front == null) // on first
            System.out.print("\nEmpty Queue");
        else {
            Node t = front; // 1
            if (front == rear) // single node
                front = rear = null;
            else
                front = front.next; // 2
            System.out.print("\nDeleted:" + t.data);
        }
    }

    void print_queue() {
        if (front == null) // on first
            System.out.print("\nEmpty queue");
        else {
            Node t = front; // 1
            System.out.print("Element are\n");
            while (t != null) // 2
            {
                System.out.print("|" + t.data + "|-");
                t = t.next;
            }
            System.out.print("null");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dynamic_Queue obj = new Dynamic_Queue();
        int choice = 0, e;
        
        do {
            System.out.print("\n\nQueue Menu");
            System.out.print("\n-----------");
            // Fixed the syntax error on the line below
            System.out.print("\n1. Enqueue"); 
            System.out.print("\n2. Dequeue");
            System.out.print("\n3. Print Queue");
            System.out.print("\n0. Exit");
            System.out.print("\nEnter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element: ");
                    e = sc.nextInt();
                    obj.enqueue(e);
                    break;

                case 2:
                    obj.dequeue();
                    break;

                case 3:
                    obj.print_queue();
                    break;

                case 0:
                    System.out.print("\nExiting... coded by Amar Career Credentials");
                    break;

                default:
                    System.out.print("Invalid choice");
            }
        } while (choice != 0);
        
        sc.close();
    }
}