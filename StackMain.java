import java.util.Scanner;

public class StackMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StackClass s = new StackClass();

        int size;
        int choice;
        int e;

        // Ask user for stack size
        System.out.print("Enter stack size: ");
        size = sc.nextInt();

        // Create the stack
        
        s.createStack(size);

        do {

            System.out.println("\n\nSTACK MENU");
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
                    // PUSH
                    // Accept an element from user

                    System.out.print("Enter element: ");
                    e = sc.nextInt();

                    if(s.is_full())
                    {
                        System.out.println("Stack is Full");
                    }
                    else
                    {
                         s.push(e);;
                    }

                    break;


                case 2:
                    // POP
                
                    // Before popping, check whether stack is empty
                    //
                    if (s.is_empty())
                    {
                        System.out.println("Stack is Empty");
                    }
                    else
                    {
                        e = s.pop();
                        System.out.println("Deleted element: " + e);
                    }

                    break;


                case 3:
                    // PEEK
                
                    // Check whether stack is empty
                    //
                    if (s.is_empty())
                    {
                        System.out.println("Stack is Empty");
                    }
                    else
                    {
                        e = s.peek();
                        System.out.println("Top element: " + e);
                    }

                    break;


                case 4:
                    // PRINT STACK
                  
                    // Check whether stack is empty
                    //
                    if (s.is_empty())
                    {
                        System.out.println("Stack is Empty");
                    }
                    else
                    {
                        s.print_stack();
                    }

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
