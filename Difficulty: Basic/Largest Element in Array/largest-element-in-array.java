class Solution {
    static int larg(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        int k=arr[n-1];
        return k;
        
    }
   
    public static int largest(int[] arr) {
        larg(arr);
        int p=arr[arr.length-1];
        return p;
    }
}
