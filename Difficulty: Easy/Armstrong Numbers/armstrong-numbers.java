// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int org=n;
        int sum=0;
        int strlen=String.valueOf(n).length();
        
        while(n>0){
            int dig=n%10;
            sum+=Math.pow(dig,strlen);
            n=n/10;
        }
        
        if(sum!=org)return false;
        return true;
    }
}