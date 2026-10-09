public class CircularLinkedList {


    Node root;//Only Node, which you know and you will record
    //insert left
    void insert_left(int data)
    {
        Node n=new Node(data);
        if(root==null)//on first
            root=n;
        else
        {
            n.next=root;//1
            root=n;//2
        }
    }
    //insert right
    void insert_right(int data)
    {
        Node n=new Node(data);
        if(root==null)//on first
            root=n;
        else
        {
            Node t=root;//1:assign t to root address
            while(t.next!=null)//2:go till end
                t=t.next;//step
            t.next=n;//3:connect
        }
    }

    //    delete left
    void delete_left()
    {
        if(root==null)//on first
            System.out.print("\nEmpty list");
        else
        {
            Node t=root;//1
            root=root.next;//2
            System.out.print("\nDeleted:"+t.data);
        }
    }
    //delete right
    void delete_right()
    {
        if(root==null)//on first
            System.out.print("\nEmpty list");
        else
        {
            Node t2=root;//1
            Node t=root;//1

            while(t.next!=null)//2
            {
                t2=t;//tail method as we can not go back we would wait 1 step back
                t=t.next;
            }
            if(root.next==null)//single node
                root=null;//self delete
            else
                t2.next=null;//use tail to delete second last to last connectivity
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
            while(t!=null)//2
            {
                System.out.print("|"+ t.data+"|->");
                t=t.next;
            }
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