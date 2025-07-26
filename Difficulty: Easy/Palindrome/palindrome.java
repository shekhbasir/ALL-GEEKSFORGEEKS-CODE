class Solution {
    public boolean isPalindrome(int n) {
        // code here
        int x=0;
        int rev=0;
        int k=n;
        while(n>0){
            int val=n%10;
             rev=(rev*10)+val;
            n=n/10;
            
            
        }
        if(rev==k) {
            return true;
        }else{
            return false;
        }
       
        
    }
}