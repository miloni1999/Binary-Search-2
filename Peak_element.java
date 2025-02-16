// Problem 162
class Solution {
    public int findPeakElement(int[] nums) {
        if(nums==null || nums.length == 0) return -1;
        int n = nums.length;
        int high = n-1;
        int low = 0;
        while(low<=high){
            int mid = low + (high - low)/2;
            //peak element found
            if((mid==0||nums[mid-1]<nums[mid]) && (mid==n-1||nums[mid]>nums[mid+1])){
                return mid;
            }
            else if(nums[mid+1]>nums[mid]){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }
}
