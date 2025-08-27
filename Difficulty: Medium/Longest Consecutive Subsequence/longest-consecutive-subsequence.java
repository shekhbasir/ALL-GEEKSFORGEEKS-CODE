class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        
        HashSet<Integer> st=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            st.add(arr[i]);
        }
        
        HashSet<Integer> st2=new HashSet<>();
        
        
       int count = 0;
int val = min;

while (val <= max) {
    if (st.contains(val)) {
        count++;
    } else {
        if (count > 0) {
            st2.add(count);  
            count = 0;        
        }
    }
    val++;
}


if (count > 0) {
    st2.add(count);
}

        
      int i=0;
      int arr1[]=new int[st.size()];
      for(int va:st){
          arr1[i++]=va;
      }
      
      int len = 0;
for (int val2 : st2) {
    if (val2 > len) {
        len = val2;
    }
}
return len;
       
        
        
    }
}