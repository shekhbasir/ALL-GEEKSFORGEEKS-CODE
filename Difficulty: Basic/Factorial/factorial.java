class Solution {
     static int fact(int n){
         if(n==0) return 1;
         return n*fact(n-1);
     }
    static int factorial(int n) {
        // code here
        int jam=fact(n);
        return jam;
        
    }
}