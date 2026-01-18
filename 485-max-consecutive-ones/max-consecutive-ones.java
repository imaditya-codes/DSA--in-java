class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutive=0;
        int counterOfOne=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                counterOfOne++;
                maxConsecutive= Math.max(maxConsecutive,counterOfOne);
            }

            else{
                counterOfOne=0;
            }
        }
        return maxConsecutive;
    }
}