class Solution {
    public int maxProduct(int[] nums) {
          int maxi= Integer.MIN_VALUE;
          int n=nums.length;
          int pref=1;
          int suff=1;
          for(int i=0; i<n; i++){
            if(pref==0) pref=1;
            if(suff==0) suff=1;
            pref*=nums[i];
            suff*=nums[n-i-1];
            maxi=Math.max(maxi,Math.max(suff,pref));
          }
          return maxi;
    }
}