import java.util.Scanner;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class CircularlinkListPr {
    Node head = null;
   
    void insertFirst(int val){
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }
        Node temp = head;
        while (temp.next != head) {
            newNode.next = head;
            temp.next = newNode;
            head = newNode;
        }
    }

    void insertEnd(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            newNode.next = head;
            return;
        }

        Node temp =head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next  = newNode;
        newNode.next = head;
    }


    void deleteFirst(int val){
        if (head == null) {
            System.out.println("Empty...");
            return;
        }else if (head.next == head) {
            head = null;
            return;            
        }
        Node temp = head;
        while (temp.next != head) {
            head = head.next;
            temp.next = head;
        }
    }

    void display(){
    if (head == null) {
            System.out.println("Empty..."); 
        }
        Node temp = head;
    do {
        System.out.println(temp.data);
        temp = temp.next;
    } while (temp != head);
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    int inp;

    CircularlinkListPr obj = new CircularlinkListPr();
    
    do{
        System.out.println("1. Enter first: ");
        System.out.println("2. Enter last: ");
        System.out.println("3. Delete first: ");
        System.out.println("4. Display: ");
        System.out.println("0. Exit");
        num = sc.nextInt();
        switch (num) {
        case 1:
            System.out.println("enter values");
            inp = sc.nextInt();
            obj.insertFirst(inp);
            break;
        
        case 2:
            System.out.println("enter values");
            inp = sc.nextInt();
            obj.insertEnd(inp);
            break;
        
        case 3:
            System.out.println("enter values");
            inp = sc.nextInt();
            obj.deleteFirst(inp);
            break;

        case 4:
            obj.display();
            break;
        case 0:
            break;
        default:
            break;
        }
    }while (num != 0);
    
    sc.close();
}

}

