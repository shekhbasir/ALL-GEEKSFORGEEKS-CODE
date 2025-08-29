class Solution {
    int lowerBound(int[] arr, int target) {
        // code herearr
        int ind=-1;
        int n= arr.length;
       for(int i=0;i<n;i++){
           if(arr[i]>=target){
               ind=i;
               break;
           }
       }
       
       if(ind>=0){
           return ind;
       }else{
           return n;
       }
        
        
    }
}
