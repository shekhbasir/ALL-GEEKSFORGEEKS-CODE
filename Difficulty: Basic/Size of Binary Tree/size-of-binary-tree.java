/*

Definition for Binary Tree Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/


class Solution {
    static int count=0;
    static int size_cal(Node root){
        if(root==null)return 0;
        
        // count++;
        int haml=size_cal(root.left);
        int hamr=size_cal(root.right);
        return 1+haml+hamr;
        
    }
    public static int getSize(Node node) {
        // code here
        return size_cal(node);
    }
}