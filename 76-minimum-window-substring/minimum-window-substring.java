class Solution {
    public String minWindow(String s, String t) {
        int minlen = Integer.MAX_VALUE;
        int l = 0;
        int r = 0;
        int n = s.length();
        int m = t.length();
        int count = 0;
        int start = -1;

        HashMap<Character , Integer > map = new HashMap<>();
        for(char c : t.toCharArray()){
            map.put(c,map.getOrDefault(c , 0)+1);
        }
        while(r<n){
            if(map.containsKey(s.charAt(r)) && map.get(s.charAt(r)) > 0){
                count++;
            }
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)-1);
            while(count == m){
                 if (r - l + 1 < minlen) {
                    minlen = r - l + 1;
                    start = l;
                }
                 map.put(s.charAt(l),map.getOrDefault(s.charAt(l),0)+1);
                 if (map.get(s.charAt(l)) > 0) {
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