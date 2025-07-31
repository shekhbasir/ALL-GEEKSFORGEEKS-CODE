class Solution {
    static void merg(int arr[],int st,int mid,int end){
        
        int i=st;
        int j=mid+1;
        int k=0;
        
        int temp[]=new int[end-st+1];
        while(i<=mid && j<=end){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                k++;
                i++;
            }else{
                temp[k]=arr[j];
                k++;
                j++;
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
    
    
    
    static void divid(int arr[],int st,int end){
        if(st<end){
            int mid=st+(end-st)/2;
            
            divid(arr,st,mid);
            divid(arr,mid+1,end);
            
            
            merg(arr,st,mid,end);
        }
    }
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        
        divid(arr,0,arr.length-1);
        
       
    }
}
