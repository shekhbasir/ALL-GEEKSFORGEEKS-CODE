class Solution {
    int upperBound(int[] arr, int target) {
        // code here
        int n=arr.length;
        int ans=n;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low);
            if(arr[mid]>target){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}
