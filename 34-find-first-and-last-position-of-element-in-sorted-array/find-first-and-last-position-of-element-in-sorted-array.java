class Solution {
    public int[] searchRange(int[] arr, int target) {
        int first=first0ccurence( arr, target);
         int last=last0ccurence(arr, target);
         if (first == -1) {
            return new int[]{-1, -1};
        }

         return new int[]{first,last};
       
    }
    public int first0ccurence(int[] arr,int target){
    int low=0;
    int high= arr.length-1;
    int first=-1;
    while(low<=high){
       int mid=low+(high-low)/2;
        if(arr[mid]==target){
            first=mid;
            high=mid-1;
        }
        else if(arr[mid]<target){
            low=mid+1;
        }
        else{
            high=mid-1;
        }
    }
    return first;
    }

    public int last0ccurence(int[] arr,int target){
    int low=0;
    int high= arr.length-1;
    int last=-1;
    while(low<=high){
       int mid=low+(high-low)/2;
        if(arr[mid]==target){
            last=mid;
            low=mid+1;
        }
        else if(arr[mid]<target){
            low=mid+1;
        }
        else{
            high=mid-1;
        }
    }
    return last;
    }

}