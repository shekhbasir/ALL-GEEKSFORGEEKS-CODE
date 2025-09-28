/*
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}*/

class Solution {
    public boolean kam(Node r1,Node r2){
        if(r1==null && r2==null) return true;
        
        if(r1==null || r2==null) return false;
        
        return (r1.data==r2.data) && kam(r1.left,r2.left) && kam(r1.right,r2.right);
    }
    boolean isIdentical(Node r1, Node r2) {
        return kam(r1,r2);
        // code here
        
    }
}