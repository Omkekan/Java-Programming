import java.util.*;

public class DequeMenu
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        // Create ArrayDeque
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        int choice, value;

        do
        {
            System.out.println("\n===== DOUBLE ENDED QUEUE =====");
            System.out.println("1. Insert at Front");
            System.out.println("2. Insert at Rear");
            System.out.println("3. Delete from Front");
            System.out.println("4. Delete from Rear");
            System.out.println("5. Display");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();

                    dq.offerFirst(value);

                    break;

                case 2:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();

                    dq.offerLast(value);

                    break;

                case 3:

                    if(dq.isEmpty())
                    {
                        System.out.println("Deque is empty");
                    }
                    else
                    {
                        System.out.println(
                            "Deleted = " +
                            dq.pollFirst()
                        );
                    }

                    break;

                case 4:

                    if(dq.isEmpty())
                    {
                        System.out.println("Deque is empty");
                    }
                    else
                    {
                        System.out.println(
                            "Deleted = " +
                            dq.pollLast()
                        );
                    }

                    break;

                case 5:

                    if(dq.isEmpty())
                    {
                        System.out.println("Deque is empty");
                    }
                    else
                    {
                        System.out.println(
                            "Deque = " + dq
                        );
                    }

                    break;

                case 6:
                    System.out.println("Program terminated.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while(choice!=0);

        sc.close();
    }
}
