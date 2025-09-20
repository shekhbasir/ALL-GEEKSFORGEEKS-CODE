/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int d) {
        data = d;
        left = right = null;
    }
}
*/

class BST {
    public static boolean searching(Node root,int x){
        if(root==null){
            return false;
        }
        if(root.data==x)  return true;
        
        
       
        return searching(root.left,x)||  searching(root.right,x);
    }
    // Function to search a node in BST.
    boolean search(Node root, int x) {
        // Your code here
        return searching(root,x);
    }
}