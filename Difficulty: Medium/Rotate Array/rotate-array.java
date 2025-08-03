// User function Template for Java

class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        
        int n=arr.length;
        int l=d%n;
        
        int temp[]=new int[l];
        for(int i=0;i<l;i++){
            temp[i]=arr[i];
        }
        
        //now changing the position 
        
        int j=0;
        for(int i=l;i<n;i++){
            arr[j]=arr[i];
            j++;
    }
    //now copy the value from the temp to the this array
    int p=0;
    for(int i=n-l;i<n;i++){
        arr[i]=temp[p];
        p++;
    }
    }
}