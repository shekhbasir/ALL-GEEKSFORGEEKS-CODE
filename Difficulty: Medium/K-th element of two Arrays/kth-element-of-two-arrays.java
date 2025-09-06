class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int n=a.length;
        int m=b.length;
        int tl=n+m;
        int arr[]=new int[tl];
        
        int i=0;
        int l1=0;
        int l2=0;
        while(l1<n && l2<m){
            if(a[l1]<b[l2]){
                arr[i]=a[l1];
                l1++;
               
            }else{
                arr[i]=b[l2];
                l2++;
               
            }
             i++;
        }
        
        while(l1<n){
            arr[i]=a[l1];
            l1++;
            i++;
        }
         while(l2<m){
            arr[i]=b[l2];
            l2++;
            i++;
        }
       
        
       
        
        return arr[k-1];
    }
}