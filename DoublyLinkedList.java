public class DoublyLinkedList {

    static class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node root, last;

    void insert_left(int data) {
        Node n = new Node(data);
        if (root == null) {
            root = last = n;
        } else {
            n.next = root;
            root.prev = n;
            root = n;
        }
    }

    void insert_right(int data) {
        Node n = new Node(data);
        if (last == null) {
            root = last = n;
        } else {
            n.prev = last;
            last.next = n;
            last = n;
        }
    }

    void delete_left() {
        if (root == null) {
            System.out.print("\nEmpty list");
            return;
        }
        Node t = root;
        root = root.next;
        if (root != null)
            root.prev = null;
        else
            last = null;
        System.out.print("\nDeleted: " + t.data);
    }

    void delete_right() {
        if (last == null) {
            System.out.print("\nEmpty list");
            return;
        }
        Node t = last;
        last= last.prev;
        if (last != null)
           last.next = null;
        else
            last = null;
        System.out.print("\nDeleted: " + t.data);
    }

    void print_list() {
        if (last == null) {
            System.out.print("\nEmpty list");
            return;
        }
        System.out.print("\nElements are: \n");
        System.out.print("\nnull");
        for (Node t = root; t != null; t = t.next)
            System.out.print(" <-> " + t.data);
        System.out.print(" <-> null\n");
    }

    void print_reverse() {
        if (last == null) {
            System.out.print("\nEmpty list");
            return;
        }
        System.out.print("\nReverse: \n");
        System.out.println("null");
        for (Node t = last; t != null; t = t.prev)
            System.out.print(" <-> " + t.data);
    }

    boolean search_list(int key) {
        for (Node t = root; t != null; t = t.next)
            if (t.data == key)
                return true;
        return false;
    }

    void insert_after(int ref, int data) {
        if (root == null) {
            System.out.print("\nEmpty list");
            return;
        }
        for (Node t = root; t != null; t = t.next) {
            if (t.data == ref) {
                Node n = new Node(data);
                n.prev = t;
                n.next = t.next;
                if (t.next != null)
                    t.next.prev = n;
                else
                        last = n;
                t.next = n;
                return;
            }
        }
        System.out.print("\n" + ref + " Not found");
    }

    void delete_element(int element) {
        if (root == null) {
            System.out.print("\nEmpty list");
            return;
        }
        for (Node t = root; t != null; t = t.next) {
            if (t.data == element) {
                if (t.prev != null)
                    t.prev.next = t.next;
                else
                    root = t.next;

                if (t.next != null)
                    t.next.prev = t.prev;
                else
                    last = t.prev;

                System.out.print("\n" + element + " deleted");
                return;
            }
        }
        System.out.print("\n" + element + " Not found");
    }

}