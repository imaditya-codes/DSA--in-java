class Solution {

    public int findMax(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(arr[i],max);
        }
        return max;
    }

    public long  totalHr(int[] arr,int hourly){
        long totalHrs=0;
        for(int i=0;i<arr.length;i++){
            totalHrs+=(long)Math.ceil((double)arr[i]/hourly);
        }
        return totalHrs;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=findMax(piles);
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid=low+(high-low)/2;
            long totalHour=totalHr(piles,mid);
            if(totalHour<=h){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}