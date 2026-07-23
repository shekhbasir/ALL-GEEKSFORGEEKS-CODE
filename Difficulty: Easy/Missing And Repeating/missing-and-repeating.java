class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        
        int n=arr.length;
        HashMap<Integer,Integer> st=new HashMap<>();
        
        for(Integer val:arr){
            st.put(val,st.getOrDefault(val,0)+1);
        }
        
        //now pointing one value 
        int missing=-1;
        int repeat=-1;
        
        for(Map.Entry<Integer,Integer> sabdata:st.entrySet()){
            if(sabdata.getValue()==2){
                repeat=sabdata.getKey();
                break;
            }
        }
        
        //now i am going to finding the value for the misin
        
        for(int i=1;i<=n;i++){
            if(!st.containsKey(i)){
                missing=i;
                break;
            }
        }
        
        ArrayList<Integer> st1=new ArrayList<>();
        //now i am going to retunr 
        st1.add(repeat);
        st1.add(missing);
        
        return st1;
        
    }
}
