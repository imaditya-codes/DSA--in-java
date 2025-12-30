class Solution {
   boolean possible(int[] arr, int day, int m, int k){
    int count=0;
    int noOfB=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]<=day){
            count++;
        }
        else{
            noOfB += count/k;
             if (noOfB>= m) return true;
            count=0;
        }
    }
    noOfB += count/k;
    if(noOfB >= m){
        return true;
    }
    else return false;
   }



    public int minDays(int[] bloomDay, int m, int k) {
        long val=m*k;
        if((long)m*k>bloomDay.length) return -1;
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        for(int day:bloomDay){
           low= Math.min(low, day);
           high=Math.max(high, day);
        }
        while(low<=high){
           int mid=(low)+(high-low)/2;
            if(possible(bloomDay,mid,m,k)==true){
                high=mid-1;
            }
            else
            low=mid+1;
        }
        return low;
        
    }
}