class Solution {
    public int thirdLargest(List<Integer> arr) {
        // code here
        
        if(arr.size()<3) return -1;
        
       int arr1[]=new int[arr.size()];
       for(int i=0;i<arr.size();i++){
           arr1[i]=arr.get(i);
       }
       Arrays.sort(arr1);
       return arr1[arr1.length-3];
        
    }
}