class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int n = nums.length;
        int start=0, end=n-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target) ans[0]=mid;
            if(nums[mid]>=target) end=mid-1;
            else start=mid+1; 
        }
        start=0; end=n-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target) ans[1]=mid;
            if(nums[mid]<=target) start=mid+1;
            else end=mid-1;
        }
        return ans;
    }
}