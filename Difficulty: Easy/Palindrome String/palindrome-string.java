class Solution {
    static boolean ham(int i,int j,String s){
       if(i>=j) return true;
       if(s.charAt(i)!=s.charAt(j)) return false;
       return ham(i+1,j-1,s);
        
    }
    boolean isPalindrome(String s) {
        // code here
       return  ham(0,s.length()-1,s);
    }
}