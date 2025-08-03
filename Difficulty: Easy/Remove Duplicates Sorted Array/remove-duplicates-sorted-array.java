class Solution {
    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        // Set<Integer> set=new HashSet<>();
        // for(int i=0;i<arr.length;i++){
        //     set.add(arr[i]);       
        //     }
            
        //     // return set;
            
        //     ArrayList<Integer> st=new ArrayList<>();
            
        //     // int k=0;
        //     for(int v:set){
        //         st.add(v);
        //     }
        //     return st;
        
        
        ArrayList<Integer> st=new ArrayList<>();
        st.add(arr[0]);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                st.add(arr[i+1]);
            }
        }
        
        return st;
    }
}
