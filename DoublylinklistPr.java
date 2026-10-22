class Node{
    int data;
    Node next ;
    Node prev ;

    Node(int data){
        this.data = data;
    }
}

public class DoublylinklistPr {
    Node head = null;

    void insertEnd(int val){
        Node newNode = new Node (val);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next !=null) {
            temp = temp.next;
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    void deleteByValue(int val){
        if (head == null) {
            System.out.println("List is empty..");
            return;
        }
        if (head.data == val) {
            head = head.next;
            head.prev = null;
            return;
        }else{
            Node temp = head;
            while (temp != null && temp.data != val) {
                temp = temp.next;
            }
            if (temp == null) {
                System.out.println("Not found");
                return;
            }
            temp.prev.next = temp.next;
            if (temp.next != null) {
                temp.next.prev = temp.prev;
            }
        }

    }
}
