class Solution {
    public int reverseDigits(int n) {
        // Code here
        int rev=0;
        int kam=n;
        while(kam>0){
            int kux=kam%10;
            kam=kam/10;
            rev=(rev*10)+kux;
        }
        return rev;
    }
}