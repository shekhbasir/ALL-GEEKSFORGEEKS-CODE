class Solution {
    int lowerBound(int[] arr, int target) {
        int n = arr.length;
        int index = n;   // agar element bada hai sabse, to n return karna hai
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= target) {
                index = mid;      // potential answer
                high = mid - 1;   // left side me aur chhota dhoondho
            } else {
                low = mid + 1;    // right side me dhoondho
            }
        }
        return index;
    }
}
