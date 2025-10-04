class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0, max=Integer.MIN_VALUE;
        for(int j=0; j<nums.length ; j++){
            sum += nums[j];
            max = Math.max(max, sum);
            if(sum<0) sum=0;
        }
        return max;
    }
}