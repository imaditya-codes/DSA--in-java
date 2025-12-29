class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> peaks = new ArrayList<>();

        int n = mountain.length;

        // First and last elements cannot be peaks
        for (int i = 1; i < n - 1; i++) {
            if (mountain[i] > mountain[i - 1] &&
                mountain[i] > mountain[i + 1]) {
                peaks.add(i);
            }
        }

        return peaks;
    }
}
