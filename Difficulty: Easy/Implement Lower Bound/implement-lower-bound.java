class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        
        int n=arr.length;
        int low=0;
        int higher=n-1;
        int ans=n;
        while(low<=higher){
            int mid=low+(higher-low)/2;
            if(arr[mid]>=target){
                ans=mid;
                higher=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}
