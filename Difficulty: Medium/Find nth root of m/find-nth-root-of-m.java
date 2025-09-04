class Solution {
    public int kam(int mid,int n,int m){
        int ans=1;
        for(int i=1;i<=n;i++){
            ans*=mid;
            if(ans>m) return ans;
        }
        return ans;
    }
    public int nthRoot(int n, int m) {
        // code here
        int low=1,high=m;
        int val=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            
             val=kam(mid,n,m);
            if(val==m)return mid;
            if(val<m){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
}