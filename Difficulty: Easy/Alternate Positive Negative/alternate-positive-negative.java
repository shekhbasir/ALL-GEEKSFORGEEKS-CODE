class Solution {
    void rearrange(ArrayList<Integer> arr) {
        ArrayList<Integer> st1 = new ArrayList<>(); 
        ArrayList<Integer> st2 = new ArrayList<>(); 
        int n = arr.size();

    
        for (int i = 0; i < n; i++) {
            if (arr.get(i) >= 0) {
                st1.add(arr.get(i));
            } else {
                st2.add(arr.get(i));
            }
        }

        arr.clear();

        int i = 0, j = 0;
        boolean posTurn = true;

     
        while (i < st1.size() && j < st2.size()) {
            if (posTurn) {
                arr.add(st1.get(i++));
            } else {
                arr.add(st2.get(j++));
            }
            posTurn = !posTurn;
        }

  
        while (i < st1.size()) {
            arr.add(st1.get(i++));
        }

        
        while (j < st2.size()) {
            arr.add(st2.get(j++));
        }
    }
}
