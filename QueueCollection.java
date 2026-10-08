import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class QueueCollection {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> obj = new ArrayDeque<>();
        
        System.out.print("\nEnter size of Queue: ");
        int maxSize = sc.nextInt(); // We will use this to manually enforce a max size

        int choice = 0, e;
        do {
            System.out.print("\n\nQueue Menu");
            System.out.print("\n-----------");
            System.out.print("\n1. Enqueue");
            System.out.print("\n2. Dequeue");
            System.out.print("\n3. Print Queue");
            System.out.print("\n0. Exit");
            System.out.print("\nEnter choice: ");

            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    // Check size manually instead of is_full()
                    if(obj.size() < maxSize) {
                        System.out.print("Enter element: ");
                        e = sc.nextInt();
                        obj.offer(e); // offer() is Java's built-in equivalent to enqueue()
                        System.out.print(e + " Enqueued.");
                    } else {
                        System.out.print("Queue Full");
                    }
                    break;

                case 2:
                    // isEmpty() is Java's built-in method
                    if(!obj.isEmpty()) {
                        System.out.print("Dequeued Element: " + obj.poll()); // poll() is Java's equivalent to dequeue()
                    } else {
                        System.out.print("Queue Empty");
                    }
                    break;

                case 3:
                    if(!obj.isEmpty()) {
                        // You don't need a custom print_queue() method. Java Collections can print themselves!
                        System.out.print("Current Queue: " + obj); 
                    } else {
                        System.out.print("Queue Empty");
                    }
                    break;

                case 0:
                    System.out.print("\nExiting... coded by Amar Career Credentials\n");
                    break;

                default:
                    System.out.print("Invalid choice");
            }

        } while(choice != 0);
        
        sc.close();
    }
}