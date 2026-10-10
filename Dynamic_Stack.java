import java.util.Scanner;

public class Dynamic_Stack {
    
    // Add the missing Node class
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node tos; // Top of stack

    // Insert left (push to top)
    void push(int data) {
        Node n = new Node(data);
        if (tos == null) {
            tos = n;
        } else {
            n.next = tos; 
            tos = n;      
        }
    }

    // Delete left (pop from top)
    void pop() {
        if (tos == null) {
            System.out.print("\nEmpty Stack");
        } else {
            Node t = tos; 
            tos = tos.next; 
            System.out.print("\nPopped: " + t.data);
        }
    }

    // View top element
    void peek() {
        if (tos == null) {
            System.out.print("\nEmpty Stack");
        } else {
            System.out.print("\nAt Peek we have: " + tos.data);
        }
    }

    // Print all elements
    void print_stack() {
        if (tos == null) {
            System.out.print("\nEmpty Stack");
        } else {
            Node t = tos; 
            System.out.print("\nElements are:\n");
            while (t != null) {
                System.out.print("| " + t.data + " |");
                System.out.print("\n-----\n");
                t = t.next;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dynamic_Stack s = new Dynamic_Stack();
        int choice;
        int e;
        
        do {
            System.out.println("\nSTACK MENU");
            System.out.println("-------------------------");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print Stack");
            System.out.println("0. Exit");
            System.out.println("-------------------------");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element: ");
                    e = sc.nextInt();
                    s.push(e);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.peek();
                    break;
                case 4:
                    s.print_stack();
                    break;
                case 0:
                    System.out.println("Exiting Stack Program...");
                    break;
                default:
                    System.out.println("Wrong choice!");
            }
        } while (choice != 0);
        
        sc.close();
    }
}