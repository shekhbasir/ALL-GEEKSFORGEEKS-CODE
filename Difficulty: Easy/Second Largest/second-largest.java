class Solution {
    
    
    static void merg(int arr[],int st,int mid,int end){
        int i=st;
        int j=mid+1;
        int k=0;
        
        int temp[]=new int[end-st+1];
        
        while(i<=mid && j<=end){
        if (arr[i] > arr[j]) {
    temp[k++] = arr[i++];  
} else {
    temp[k++] = arr[j++];
}
        }
        
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        
        while(j<=end){
            temp[k++]=arr[j++];
        }
        
        for(int p=0;p<temp.length;p++){
            arr[st+p]=temp[p];
        }
    }
    static void divide(int arr[],int st,int end){
        int n=arr.length;
        if(st<end){
            int mid=st+(end-st)/2;
            divide(arr,st,mid);
            divide(arr,mid+1,end);
            
            merg(arr,st,mid,end);
        }
    }
    public int getSecondLargest(int[] arr) {
        // code here
        
        divide(arr,0,arr.length-1);
        int n=arr.length;
        int larg=arr[0];
       for (int i = 1; i < arr.length; i++) {
            if (arr[i] < larg) {
                return arr[i];
            }
        }

        return -1; 
    }
}