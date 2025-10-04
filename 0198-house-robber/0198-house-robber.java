class Solution {
    public int rob(int[] nums) {
        int s=0, gap=2, ans=0;
        int n=nums.length;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);
        int[] arr=new int[n+1];
        arr[0]=nums[0];
        for(int i=1;i<n;i++){
            if(i==1) {
                if(nums[0]<nums[i]) arr[i]=nums[i];
                else arr[i]=nums[0];
                continue;
            }
            if(nums[i]+arr[i-2]>arr[i-1]) arr[i]=nums[i]+arr[i-2];
            else arr[i]=arr[i-1];
        }
        return Arrays.stream(arr).max().getAsInt();
    }
}