class Solution {
static void time(int s,int N){
    if(s==N) return;
   
   System.out.print("GFG ");
   time(s+1,N);
    //  s++;
   
    
}
    void printGfg(int N) {
        // code here
        int s=0;
        
        time(s,N);
    }
}