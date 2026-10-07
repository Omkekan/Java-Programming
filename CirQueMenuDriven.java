import java.util.Scanner;

public class CirQueMenuDriven {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        CircularQueue obj = new CircularQueue();
 
        System.out.print("\nEnter size of Queue: ");
        int size = sc.nextInt();
        obj.createQueue(size);
 
        int choice = 0, e;
        do
        {
            System.out.print("\n\nQueue Menu");
            System.out.print("\n-----------");
            System.out.print("\n1. Enqueue");
            System.out.print("\n2. Dequeue");
            System.out.print("\n3. Print Queue");
            System.out.print("\n0. Exit");
            System.out.print("\nEnter choice: ");
 
            choice = sc.nextInt();
 
            switch(choice)
            {
                case 1:
                    if(!obj.is_full())
                    {
                        System.out.print("Enter element: ");
                        e = sc.nextInt();
                        obj.enqueue(e);
                    }
                    else
                        System.out.print("Queue Full");
                    break;
 
                case 2:
                    if(!obj.is_empty())
                        System.out.print("Dequeued Element: " + obj.dequeue());
                    else
                        System.out.print("Queue Empty");
                    break;
 
                case 3:
                    if(!obj.is_empty())
                        obj.print_queue();
                    else
                        System.out.print("Queue Empty");
                    break;
 
                case 0:
                    System.out.print("\nExiting...");
                    break;
 
                default:
                    System.out.print("Invalid choice");
            }
 
        } while(choice != 0);
        sc.close();
    }
}
