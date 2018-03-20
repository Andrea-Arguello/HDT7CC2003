package hoja7;

public class BinarySearchTree {
    // Root of BST
    Node root;
 
    // Constructor
    public BinarySearchTree() { 
        this.root = null; 
    }
 
    // This method mainly calls insertRec()
    public void insert(Association key) {
       this.root = insertRec(this.root, key);
    }
     
    /* A recursive function to insert a new key in BST */
    public Node insertRec(Node root, Association key) {
 
        /* If the tree is empty, return a new node */
        if (root == null) {
            root = new Node(key);
            return root;
        }
 
        /* Otherwise, recur down the tree */
        if (((String)key.getKey()).compareTo((String)root.key.getKey())==-1)
            root.left = insertRec(root.left, key);
        else if (((String)key.getKey()).compareTo((String)root.key.getKey())==1)
            root.right = insertRec(root.right, key);
 
        /* return the (unchanged) node pointer */
        return root;
    }
 
    // This method mainly calls InorderRec()
    public void inorder()  {
       inorderRec(root);
    }
    
    // A utility function to do inorder traversal of BST
    public void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }
    
    public Node buscar(String key){
        return search(this.root,key);
    }
    
    
    public Node search(Node root, String key)
    {
        // Base Cases: root is null or key is present at root
        if (root==null || root.key.getKey().equals(key))
            return root;

        
        // val is greater than root's key
        if (((String)root.key.getKey()).compareTo((String)key)==1)
            return search(root.left, key);

        // val is less than root's key
        return search(root.right, key);
    }
    
    
}
