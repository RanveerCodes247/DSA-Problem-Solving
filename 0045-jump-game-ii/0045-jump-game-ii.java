class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int currentend=0, farthest=0,jumps=0;

        for(int i=0;i<n-1;i++){
            farthest=Math.max(farthest,i+nums[i]);

            if(i==currentend){
                jumps++;
                currentend=farthest;
            }
        }
        return jumps;
    }
}