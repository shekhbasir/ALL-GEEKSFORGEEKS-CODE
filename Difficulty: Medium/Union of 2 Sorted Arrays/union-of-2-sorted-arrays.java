import java.util.*;

class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        Set<Integer> st = new TreeSet<>();  // TreeSet for sorted output

        for (int num : a) {
            st.add(num);
        }

        for (int num : b) {
            st.add(num);
        }

        ArrayList<Integer> arr = new ArrayList<>();
        for (int num : st) {
            arr.add(num);  // ✅ Use add(), not push
        }

        return arr;
    }
}

