class Solution {
    static void ham(int i,int N){
        if(i==N+1) return ;
        System.out.print(" "+i);
        ham(i+1,N);
    }
    static void printTillN(int N) {
        // code here
        int i=1;
        ham(i,N);
        
    }
}