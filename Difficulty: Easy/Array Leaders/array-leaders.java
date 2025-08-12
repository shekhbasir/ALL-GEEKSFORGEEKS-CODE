class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int max=Integer.MIN_VALUE;
        ArrayList<Integer> st=new ArrayList<>();
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>=max){
                st.add(0,arr[i]);
                max=arr[i];
                
            }
        }
        return st;
    }
}
