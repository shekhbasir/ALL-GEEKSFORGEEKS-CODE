class Solution {
    void selectionSort(int[] arr) {
        // code here
        int n=arr.length;
         for(int i=0;i<n-1;i++){
             int min=i;
             for(int j=i+1;j<n;j++){
                 if(arr[min]>arr[j]){
                     int temp=arr[min];
                     arr[min]=arr[j];
                     arr[j]=temp;
                 }
             }
         }
        
    }
}