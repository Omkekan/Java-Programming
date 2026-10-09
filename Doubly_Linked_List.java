import java.util.Scanner;

public class Doubly_Linked_List {

    static class Dnode {
        int data;
        // 1. Fixed to match the .left and .right used in your methods
        Dnode left, right; 

        // 2. Fixed constructor name to match the class
        Dnode(int data) { 
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    Dnode root; // create root

    void insert_left(int data) {
        Dnode n = new Dnode(data); // create a node
        if (root == null) // only 1st time
            root = n;
        else {
            n.right = root;
            root.left = n; // 1,2
            root = n; // 3
        }
    }

    void delete_left() {
        if (root == null)
            System.out.print("\nEmpty List");
        else {
            Dnode t = root; // 1
            if (root.right == null) // Check if it's the only node
                root = null;
            else {
                root = root.right; // 2
                root.left = null; // 3
            }
            System.out.print("\n<-|" + t.data + "|-> deleted");
        }
    }

    void insert_right(int data) {
        Dnode n = new Dnode(data); // create a node
        if (root == null) // only 1st time
            root = n;
        else {
            Dnode t = root; // 1 start from root
            while (t.right != null) // 2 move to right most
                t = t.right;
            t.right = n; // 3 connected
            n.left = t; // 4
        }
    }

    void delete_right() {
        if (root == null)
            System.out.print("\nEmpty List");
        else {
            Dnode t = root; // 1
            if (root.right == null) // single node
                root = null; // manual deletion
            else {
                while (t.right != null) // 2
                    t = t.right;
                Dnode t2 = t.left; // 3 ref to prev who is on left
                t2.right = null; // 4
            }
            System.out.print("\n<-|" + t.data + "|-> deleted");
        }
    }

    void print_list() {
        if (root == null)
            System.out.print("\nList Empty");
        else {
            Dnode t = root;
            System.out.print("\nNULL");
            while (t != null) {
                System.out.print(" <-|" + t.data + "|-> ");
                t = t.right;
            }
            System.out.print("NULL");
        }
    }

    void print_list_rev() // print from last to first
    {
        if (root == null)
            System.out.print("\nList Empty");
        else {
            Dnode t = root;
            System.out.print("\nNULL");
            // only go to last and stop
            while (t.right != null) // loop: rightmost
                t = t.right;

            // from last to first print
            while (t != null) // loop2
            {
                System.out.print(" <-|" + t.data + "|-> ");
                t = t.left;
            }
            System.out.print("NULL");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 3. Class name now correctly matches the file/class definition
        Doubly_Linked_List obj = new Doubly_Linked_List(); 

        int choice = 0, data;

        do {
            System.out.print("\n\n===== Doubly Linked List Menu =====");
            // 4. Fixed the syntax error on the print statement below
            System.out.print("\n1. Insert Left"); 
            System.out.print("\n2. Insert Right");
            System.out.print("\n3. Delete Left");
            System.out.print("\n4. Delete Right");
            System.out.print("\n5. Print List");
            System.out.print("\n6. Print Reverse List");
            System.out.print("\n0. Exit");
            System.out.print("\nEnter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    obj.insert_left(data);
                    break;

                case 2:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    obj.insert_right(data);
                    break;

                case 3:
                    obj.delete_left();
                    break;

                case 4:
                    obj.delete_right();
                    break;

                case 5:
                    obj.print_list();
                    break;

                case 6:
                    obj.print_list_rev();
                    break;

                case 0:
                    System.out.print("\nExiting... Career Credentials Mode OFF 🚀\n");
                    break;

                default:
                    System.out.print("\nInvalid choice. Try again.");
            }

        } while (choice != 0);
        
        sc.close();
    }
}