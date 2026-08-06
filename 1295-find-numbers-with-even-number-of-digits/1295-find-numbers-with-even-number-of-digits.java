class Solution {
    public int findNumbers(int[] nums) {
        int n = nums.length;
        int count=0;

        for(int i=0;i<n;i++){
            int num = nums[i];
            int digit=0;

            while(num>0){
                num = num/10;
                digit++;
            }

            if(digit%2==0){
                count++;
            }
        }
        return count;
    }
}