class Solution {
    public boolean isSorted(int[] arr) {
        // code here
        int count=0;
        int largest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(largest<=arr[i]){
                largest=arr[i];
                count++;
            }
        }
        
        if(count==arr.length-1){
            return true;
        }
        return false;
        
    }
}