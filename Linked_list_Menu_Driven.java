import java.util.Scanner;

public class Linked_list_Menu_Driven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Linear_Linked_List obj = new Linear_Linked_List();
 
        // Note: Linked lists are dynamic, so we don't actually need to ask for a size 
        // like we do for arrays or static queues!
        
        int choice = 0, e;
        do {
            System.out.print("\n\nLinked List Menu");
            System.out.print("\n-----------");
            System.out.print("\n1. Adding element to right"); // Fixed syntax here
            System.out.print("\n2. Adding element to left");
            System.out.print("\n3. Deleting specific element");
            System.out.print("\n4. Searching element");
            System.out.print("\n5. Printing Linked list");
            System.out.print("\n0. Exit");
            System.out.print("\nEnter choice: ");
 
            choice = sc.nextInt();
 
            switch(choice) {
                case 1:
                    System.out.print("Enter element to add to right: ");
                    e = sc.nextInt();
                    obj.insert_right(e);
                    break;
 
                case 2:
                    System.out.print("Enter element to add to left: ");
                    e = sc.nextInt(); // Added missing scanner read
                    obj.insert_left(e);
                    break;
 
                case 3:
                    System.out.print("Enter element to delete: ");
                    e = sc.nextInt(); // Added missing scanner read
                    obj.delete_element(e); 
                    break;
 
                case 4:
                    System.out.print("Enter element to search: ");
                    e = sc.nextInt(); // Added missing scanner read
                    
                    // search_list returns a boolean, so we should print the result
                    if(obj.search_list(e)) {
                        System.out.print("\nFound " + e + " in the list!");
                    } else {
                        System.out.print("\nElement " + e + " not found.");
                    }
                    break;
                    
                case 5:
                    obj.print_list();
                    break;
                    
                case 0:
                    System.out.print("\nExiting...");
                    break;
 
                default:
                    System.out.print("\nInvalid choice");
            }
 
        } while(choice != 0);
        sc.close();
    }
}