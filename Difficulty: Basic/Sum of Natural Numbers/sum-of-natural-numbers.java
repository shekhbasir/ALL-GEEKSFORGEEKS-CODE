class Solution {
    static int sum(int i,int n){
        if(n==0) return 0;
        if(i==n+1) return 0;
        // return s+sum(i+1,n,s);
        return i+sum(i+1,n);
        
    }
    public static int findSum(int n) {
        // code here
    
       return sum(1,n);
       
        
    }
}
