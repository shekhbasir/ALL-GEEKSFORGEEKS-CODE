/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
}*/

class Solution {
    public static int leaf(Node root){
        int count=0;
        if(root==null) return 0;
        
        if(root.left==null && root.right==null) return 1;
        return leaf(root.left)+leaf(root.right);
    }
    int countLeaves(Node node) {
        // Your code
        int kam=leaf(node);
        return kam;
    }
}