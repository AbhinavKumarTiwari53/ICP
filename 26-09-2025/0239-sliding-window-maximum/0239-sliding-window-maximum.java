class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int s=0, e=0, ans=nums[0], n = nums.length,idx=0;
        int[] res=new int[n-k+1];
        Deque<Integer> dq=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            if(!dq.isEmpty() && i-k>=dq.peekFirst()) dq.pollFirst();
            while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i]) dq.pollLast();
            dq.offerLast(i);
            if(i>=k-1) res[idx++] = nums[dq.peekFirst()];
        }
        return res;
    }
}