import java.util.Scanner;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.left = null;
        this.right = null;
        this.data = data;
    }
}

public class BstPr {
    Node root = null;

    Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        
        if (val < root.data) {
            root.left = insert(root.left, val);
        } else if (val > root.data) {
            root.right = insert(root.right, val);
        }

        return root;
    }

    // Changed return type to void
    void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    // Changed return type to void
    void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    // Changed return type to void
    void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, e;
        
        // FIX 1: Trees don't need a fixed size! Removed `System.out.println("Enter Size")` and `s`.
        BstPr obj = new BstPr(); 

        do {
            System.out.println("\n1. insert  2. inOrder  3. postOrder  4. preOrder  0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to insert: ");
                    e = sc.nextInt();
                    // FIX 2: Capture the returned root so the tree actually grows!
                    obj.root = obj.insert(obj.root, e);
                    break;
                case 2:
                    System.out.print("Inorder: ");
                    obj.inOrder(obj.root); // FIX 3: Pass obj.root instead of integer r
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Postorder: ");
                    obj.postOrder(obj.root);
                    System.out.println();
                    break;
                case 4:
                    System.out.print("Preorder: ");
                    obj.preOrder(obj.root);
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);
        sc.close();
    }
}