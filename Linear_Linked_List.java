class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Linear_Linked_List {
    Node root; 

    void insert_left(int data) {
        Node n = new Node(data);
        if (root == null) 
            root = n;
        else {
            n.next = root; 
            root = n; 
        }
    }

    void insert_right(int data) {
        Node n = new Node(data);
        if (root == null) 
            root = n;
        else {
            Node t = root; 
            while (t.next != null) 
                t = t.next; 
            t.next = n; 
        }
    }

    void delete_left() {
        if (root == null) 
            System.out.print("\nEmpty list");
        else {
            Node t = root; 
            root = root.next; 
            System.out.print("\nDeleted: " + t.data);
        }
    }

    void delete_right() {
        if (root == null) 
            System.out.print("\nEmpty list");
        else {
            Node t2 = root; 
            Node t = root; 

            while (t.next != null) {
                t2 = t; 
                t = t.next;
            }
            if (root.next == null) 
                root = null; 
            else
                t2.next = null; 
            System.out.print("\nDeleted: " + t.data);
        }
    }

    void print_list() {
        if (root == null) 
            System.out.print("\nEmpty list");
        else {
            Node t = root; 
            System.out.print("\nElements are: \n");
            while (t != null) { 
                System.out.print("|" + t.data + "->");
                t = t.next;
            }
            System.out.print("null\n");
        }
    }

    boolean search_list(int key) {
        if (root == null) 
            System.out.print("\nEmpty list");
        else {
            Node t = root; 
            while (t != null) {
                if (t.data == key)
                    return true;
                t = t.next;
            }
        }
        return false;
    }

    void insert_after(int ref, int data) {
        if (root == null) 
            System.out.print("\nEmpty list");
        else {
            Node t = root; 
            while (t != null) {
                if (t.data == ref) {
                    Node n = new Node(data); 
                    n.next = t.next; 
                    t.next = n; 
                    return;
                }
                t = t.next;
            }
            System.out.print("\n" + ref + " Not found");
        }
    }

    void delete_element(int element) {
        if (root == null) 
            System.out.print("\nEmpty list");
        else {
            Node t = root; 
            Node t2 = root; 
            while (t != null) {
                if (t.data == element) {
                    if (t == root) 
                        root = root.next; 
                    else if (t.next == null) 
                        t2.next = null; 
                    else
                        t2.next = t.next;
                    System.out.print("\n" + t.data + " deleted");
                    return;
                }
                t2 = t;
                t = t.next;
            }
            System.out.print("\n" + element + " Not found");
        }
    }
}