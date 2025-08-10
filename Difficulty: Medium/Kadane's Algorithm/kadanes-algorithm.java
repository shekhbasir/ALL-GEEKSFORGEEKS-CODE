class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        
        int max = Integer.MIN_VALUE;
        int n=arr.length;
       int sum=0;
       for(int i=0;i<n;i++){
           sum+=arr[i];
           if(sum>max){
               max=sum;
               
               
           }
           
           
           if(sum<0){
               sum=0;
           }
       }
       return max;
    }
}
