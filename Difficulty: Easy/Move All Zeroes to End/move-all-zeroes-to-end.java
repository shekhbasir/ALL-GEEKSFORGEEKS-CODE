class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
         int n=arr.length;
        int j=0;
        int count=0;
        int temp[]=new int[n];

        //simply it is going to push the value in new array 
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
            temp[j++]=arr[i];
            count++;

            }
        }
        //ye code reaming me zero var di

        int val=n-count;
        for(int i=count;i<n;i++){
            temp[i]=0;
        }

        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
    }
}