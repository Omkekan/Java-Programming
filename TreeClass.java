public class TreeClass {

    
    public static class Node {
        int data;
        Node left, right;
        
        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }
    
    Node root;
    
    void insert(Node r, Node n) {
        if (root == null) // First node becomes root.
            root = n;
        else {
            if (n.data < r.data) // go to left
            {
                if (r.left == null)
                    r.left = n;
                else
                    insert(r.left, n);
            } 
            else // go to right
            {
                if (r.right == null)
                    r.right = n;
                else
                    insert(r.right, n);
            }
        }
    }
    
    void inorder(Node r) // LPR
    {
        if (r != null) {
            inorder(r.left);
            System.out.print(r.data + ", ");
            inorder(r.right);
        }
    }

    void preorder(Node r){ //PLR +AB
        if(r != null){
            System.out.print(r.data + ", ");            
            preorder(r.left);
            preorder(r.right);
        }
    }

    void postorder(Node r){ //LRP AB+
        if(r != null){
            postorder(r.left);
            postorder(r.right);
            System.out.print(r.data + ", "); 
        }
    }

    int count_node(Node r){      
        if (r == null) {
            return 0;
        }else {
            return 1 + count_node(r.left) + count_node(r.right);
        }        
    }

    int leaf_node(Node r){
        if (r == null) {
            return 0;
        }else if(r.left==null && r.right == null) {
                return 1 + count_node(r.left) + count_node(r.right);
        }else {
            // Notice there is NO "1 +" here, because the current node is not a leaf.
            return leaf_node(r.left) + leaf_node(r.right);
        }      
    }
    

    public static void main(String[] args) {
        TreeClass obj = new TreeClass();
        
        obj.insert(obj.root, new Node(10));
        obj.insert(obj.root, new Node(5));
        obj.insert(obj.root, new Node(20));
        obj.insert(obj.root, new Node(15));
        
        System.out.print("Inorder: \n");
        obj.inorder(obj.root);
        System.out.println("\npreorder: ");
        obj.preorder(obj.root);
        System.out.println("\npostorder: ");
        obj.postorder(obj.root);
        int totalNodes = obj.count_node(obj.root);
        System.out.print("\nTotal nodes: " + totalNodes);
        int leafNodes = obj.leaf_node(obj.root);
        System.out.print("\nTotal Leaf nodes: " + leafNodes);
    }
}