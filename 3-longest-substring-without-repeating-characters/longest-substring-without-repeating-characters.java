class Solution {
    public int lengthOfLongestSubstring(String s) {

        int n =s.length();

        HashMap<Character,Integer> map= new HashMap<>();

        int left=0;
        int maxLen=0;
        int right=0;

        while(right<n){
            char ch = s.charAt(right);
            if(map.containsKey(ch)){
                left = Math.max(left,map.get(ch)+1);
            }
            map.put(ch,right);
            maxLen = Math.max(maxLen,(right-left+1));
            right++;
        }

        return maxLen;
    }
}