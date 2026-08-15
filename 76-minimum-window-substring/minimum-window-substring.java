class Solution {
    public String minWindow(String s, String t) {

        int minlen = Integer.MAX_VALUE;
        int l = 0;
        int r = 0;

        int n = s.length();
        int m = t.length();

        int count = 0;
        int start = -1;

        int[] freq = new int[256];

        for (char c : t.toCharArray()) {
            freq[c]++;
        }

        while (r < n) {

            if (freq[s.charAt(r)] > 0) {
                count++;
            }

            freq[s.charAt(r)]--;

            while (count == m) {

                if (r - l + 1 < minlen) {
                    minlen = r - l + 1;
                    start = l;
                }

                freq[s.charAt(l)]++;

                if (freq[s.charAt(l)] > 0) {
                    count--;
                }

                l++;
            }

            r++;
        }

        if (start == -1) {
            return "";
        }

        return s.substring(start, start + minlen);
    }
}