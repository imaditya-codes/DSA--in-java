class Solution {
    public int characterReplacement(String s, int k) {
        
        int n = s.length();
        int left = 0;
        int right = 0;
        int maxlen = 0;
        int maxfreq = 0;

        int[] freq = new int[26];
        while(right < n){

            //Add current character
            freq[s.charAt(right)-'A']++;

            //After adding current character check the new maxfreq
            maxfreq = Math.max(maxfreq , freq[s.charAt(right)-'A']);

            //if window is invalid shrink it
            while(right - left +1 - maxfreq > k){
                freq[s.charAt(left)-'A']--;
                left++;
            }

            maxlen = Math.max(maxlen , right-left+1 );
            right++;
        }

        return maxlen;
    }
}