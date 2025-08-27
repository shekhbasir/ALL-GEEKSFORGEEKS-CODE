class Solution {

  
    public int longestConsecutive(int[] arr) {
       
        int n=arr.length;
        int len=1;
        HashSet<Integer> st=new HashSet<>();
        for(int i=0;i<n;i++){
            st.add(arr[i]);
        }
        
        
        HashSet<Integer> st2=new HashSet<>();
        
       for(int j=0;j<n;j++){
    int halval = arr[j];
    
    
    if(!st.contains(halval - 1)){
        int count = 1;
        int current = halval;
        
        while(st.contains(current + 1)){
            current++;
            count++;
        }
        
        st2.add(count);   
    }
}

        
        int arr2[]=new int[st2.size()];
        
      int count=0;
       for(int val:st2){
           if(val>count){
               count=val;
           }
       }
        
        return count;
        
    }
}