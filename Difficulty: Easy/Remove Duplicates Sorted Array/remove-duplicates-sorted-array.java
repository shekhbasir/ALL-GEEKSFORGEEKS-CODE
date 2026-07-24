class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here\
        ArrayList<Integer> st=new ArrayList<>();
        
        
        st.add(arr[0]);
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                st.add(arr[i]);
            }
        }
        
        return st;
        
    }
}
