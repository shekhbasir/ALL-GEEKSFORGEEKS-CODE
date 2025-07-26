// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int ham=0;
        int pu=0;
        int k=n;
        while(n>0){
            int x=n%10;
            n=n/10;
            pu=(x*x*x);
            ham=ham+pu;
            
        }
        if(ham==k){
            return true;
        }else{
            return false;
        }
    }
}