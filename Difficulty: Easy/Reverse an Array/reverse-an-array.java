class Solution {
    static void ham(int i,int l,int arr[]){
        if(i>=l) return ;
        int s=arr[i];
        arr[i]=arr[l];
        arr[l]=s;
        ham(i+1,l-1,arr);
    }
    public void reverseArray(int arr[]) {
    // System.out.print("sheikh bsasir")
    int l=arr.length-1;
    ham(0,l,arr);
    
    }
}