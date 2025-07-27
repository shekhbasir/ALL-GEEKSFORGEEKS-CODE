class Solution {
    static void ham(int N){
        if(N==0) return;
        
        System.out.print(" "+N);
        
        ham(N-1);
    }

    void printNos(int N) {
        // code here
        ham(N);
        
    }
}