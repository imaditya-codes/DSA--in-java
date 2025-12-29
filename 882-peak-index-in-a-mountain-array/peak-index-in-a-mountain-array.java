class Solution {
    public int peakIndexInMountainArray(int[] nums) {
        int n=nums.length;

        //edge cases 
        if(n==1) return 0;
        if(nums[0]>nums[1])
        return 0;
        if(nums[n-1]>nums[n-2])
        return n-1;

        //for checking the middle elements
        int low=1;
        int high=n-2;
        while(low<=high){
            int mid=low+(high-low)/2;

            //if mid is the peak element just return it
            if((nums[mid]>nums[mid-1]) && (nums[mid]>nums[mid+1])){
                return mid;
            }

            //if peak is on the right side of the mid eliminate the left half
            else if(nums[mid]<nums[mid+1]){
                low=mid+1;
            }

            //if peak is on the left side of the mid then eliminate the right half
            else if(nums[mid]>nums[mid+1]){
                high=mid-1;
            }
        }
        return -1;
    }
}