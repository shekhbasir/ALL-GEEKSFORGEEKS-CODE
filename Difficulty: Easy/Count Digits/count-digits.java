class Solution {
    public int countDigits(int n) {
        // code here
        int x;
        int count=0;
        while(n>0){
            
            x=n%10;
            count=count+1;
            n=n/10;
        }
        
        return count;
        
    }
}
