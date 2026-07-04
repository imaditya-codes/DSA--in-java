class Solution {

    public void swapIfGreater(int[] a, int[] b, int i, int j) {
        if (a[i] > b[j]) {
            int temp = a[i];
            a[i] = b[j];
            b[j] = temp;
        }
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] a = Arrays.copyOf(nums1, m);

        int length = m + n;
        int gap = (length / 2) + (length % 2);

        while (gap > 0) {

            int left = 0;
            int right = left + gap;

            while (right < length) {

                if (left < m && right >= m) {
                   
                    swapIfGreater(a, nums2, left, right - m);
                } 
                else if (left >= m) {
                   
                    swapIfGreater(nums2, nums2, left - m, right - m);
                } 
                else {
                   
                    swapIfGreater(a, a, left, right);
                }

                left++;
                right++;
            }

            if (gap == 1)
                break;

            gap = (gap / 2) + (gap % 2);
        }

       
        int i = 0;
        for (; i < m; i++)
            nums1[i] = a[i];

        for (int j = 0; j < n; j++)
            nums1[i++] = nums2[j];
    }
}