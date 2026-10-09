public class CircularLinkedList {


    Node root, lastNode;//Only Node, which you know and you will record
    //insert left
    void insert_left(int data)
    {
        Node n=new Node(data);
        if(root==null)//on first
           {lastNode=root=n;
            lastNode.next=root;}
        else
        {
            n.next=root;//1
            root=n;//2
            lastNode.next=root;
        }
    }
    //insert right
    void insert_right(int data)
    {
        Node n=new Node(data);
        if(root==null)//on first
           { lastNode=root=n;}
        else
        {
            lastNode.next=n;
            lastNode=n;

        }
        lastNode.next=root;
    }

    //    delete left
    void delete_left() {
        // Case 1: The list is completely empty
        if (root == null) {
            System.out.print("\nEmpty list");
        } 
        // Case 2: There is only ONE node in the list
        else if (root == lastNode) {
            System.out.print("\nDeleted: " + root.data);
            root = null;
            lastNode = null; // The list is now empty
        } 
        // Case 3: There are MULTIPLE nodes in the list
        else {
            System.out.print("\nDeleted: " + root.data);
            
            // 1. Move root forward to the second node
            root = root.next; 
            
            // 2. Re-connect the last node to the new root to maintain the circle
            lastNode.next = root; 
        }
    }
    //delete right
    void delete_right()
    {
        if(root==null)//on first
            System.out.print("\nEmpty list");
        else
        {
            Node t=root;//1

            if (root==lastNode) {
             root=lastNode=null;
            System.out.print("\nEmpty list");}
            
            else{
                root=root.next;
                lastNode.next=root;
            }
            System.out.print("\nDeleted:"+t.data);
        }
    }
    
    void print_list()
    {
        if(root==null)//on first
            System.out.print("\nEmpty list");
        else
        {
            Node t=root;//1
            System.out.print("Element are\n");
            do
            {
                System.out.print("|"+ t.data+"|->");
                t=t.next;
            }while(t!=root);//2
            System.out.print("null");
        }

    }
    boolean search_list(int key)
    {
        if(root==null)//on first
            System.out.print("\nEmpty list");
        else
        {
            Node t=root;//1
            while(t!=null)//2
            {
                if(t.data==key)
                    return true;
                t=t.next;
            }
        }
        return false;

    }
    void insert_after(int ref,int data)
//Will search for the given reference element and if found will insert a node after that reference.
    {
        if(root==null)//on first
            System.out.print("\nEmpty list");
        else
        {
            Node t=root;//1
            while(t!=null)//2
            {
                if(t.data==ref)//if found
                {
                    Node n=new Node(data);//create
                    n.next=t.next;//link to t.next
                    t.next=n;//let t ref n as next
                    return;
                }
                t=t.next;
            }
            System.out.print("\n"+ref+" Not found");
        }
    }
    void delete_element(int element)
    //This method will search and delete the number if found.
    {
        if(root==null)//on first
            System.out.print("\nEmpty list");
        else
        {
            Node t=root;//1
            Node t2=root;//1
            while(t!=null)//2
            {
                if(t.data==element)//if found
                {
                    //cases
                    if(t==root)//case 1
                        root=root.next;//move root ahead
                    else if (t.next==null)//case 2
                        t2.next=null;//cut link from last
                    else
                        t2.next=t.next;
                    System.out.print("\n"+t.data+" deleted");
                    return;
                }
                t2=t;
                t=t.next;
            }
            System.out.print("\n"+element+" Not found");
        }

    }

}