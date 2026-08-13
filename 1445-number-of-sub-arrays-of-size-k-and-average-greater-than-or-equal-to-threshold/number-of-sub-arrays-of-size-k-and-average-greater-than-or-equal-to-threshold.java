class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {

        int count = 0;
        int sum = 0;

        // First window
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        if (sum >= k * threshold) {
            count++;
        }

        // Slide the window
        for (int i = k; i < arr.length; i++) {

            sum += arr[i];       // add incoming
            sum -= arr[i - k];   // remove outgoing

            if (sum >= k * threshold) {
                count++;
            }
        }

        return count;
    }
}