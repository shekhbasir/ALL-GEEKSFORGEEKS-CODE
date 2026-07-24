class Solution {
    static boolean pairInSortedRotated(int arr[], int target) {

        int n = arr.length;
        int p = -1;

        for(int i = 0; i < n - 1; i++) {
            if(arr[i] > arr[i + 1]) {
                p = i;
                break;
            }
        }

        if(p == -1) {
            p = n - 1;
        }

        int l = (p + 1) % n;
        int r = p;

        while(l != r) {

            int sum = arr[l] + arr[r];

            if(sum == target)
                return true;

            if(sum < target)
                l = (l + 1) % n;
            else
                r = (n + r - 1) % n;
        }

        return false;
    }
}