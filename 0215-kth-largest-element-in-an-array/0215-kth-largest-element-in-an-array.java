class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : nums) {
            pq.offer(num);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        return pq.peek();
    }
}
// class Solution {
//     public int findKthLargest(int[] nums, int k) {
//         int n=nums.length;
//         for(int i=0;i<n-1;i++){
//         int minindex=i;
//         for(int j=i+1;j<n;j++){
//             if(nums[j]<nums[minindex]){
//                 minindex=j;
//             }
//         }
//         int temp=nums[i];
//         nums[i]=nums[minindex];
//         nums[minindex]=temp;
//         }
//     int count=0;
//     for(int i=n-1;i>=0;i--){
//      count++;
//      if(count==k){
//         return nums[i];
//      }
//     }
//     return -1;
//     }
// } 