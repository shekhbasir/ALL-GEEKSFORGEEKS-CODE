/*
// A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Solution {
    
    static int sum(Node root){
        if(root==null) return 0;
        

       return root.data+sum(root.left)+sum(root.right);
    }
    // Function to return sum of all nodes of a binary tree
    static int sumBT(Node root) {
        // Your code here
        return sum(root);
        
        
        
    }
}