

class Solution {

    // Previous Smaller
    static int[] pse(int[] arr) {

        int n = arr.length;
        int[] left = new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }

            left[i] = st.isEmpty()
                    ? i + 1
                    : i - st.peek();

            st.push(i);
        }

        return left;
    }

    // Next Smaller or Equal
    static int[] nse(int[] arr) {

        int n = arr.length;
        int[] right = new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            right[i] = st.isEmpty()
                    ? n - i
                    : st.peek() - i;

            st.push(i);
        }

        return right;
    }

    public static int sumSubarrayMins(int[] arr) {

        long MOD = 1_000_000_007L;

        int[] left = pse(arr);
        int[] right = nse(arr);

        long ans = 0;

        for (int i = 0; i < arr.length; i++) {

            long contribution =
                    (long) arr[i] * left[i] * right[i];

            ans = (ans + contribution) % MOD;
        }

        return (int) ans;
    }
}