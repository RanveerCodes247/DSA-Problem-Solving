class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int left=0;
        int right;
        int minlength=Integer.MAX_VALUE;
        int sum=0;
        for(right=0;right<n;right++){
            sum+=nums[right];
            while(sum>=target){
                int length = right-left+1;
                minlength=Math.min(minlength,length);
                sum-=nums[left];
                left++;
            }
        }
        if(minlength==Integer.MAX_VALUE){
            return 0;
        }
        return minlength;
    }
}