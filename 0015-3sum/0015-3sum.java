class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    while (j < k && nums[j] == nums[j + 1]) {
                        j++;
                    }

                    while (j < k && nums[k] == nums[k - 1]) {
                        k--;
                    }

                    j++;
                    k--;

                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        return result;
    }
}




















// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         int n = nums.length;
//         Arrays.sort(nums);

//         List<List<Integer>> result = new ArrayList<>();

//         for (int i = 0; i < n - 2; i++) {
//             for (int j = i + 1; j < n - 1; j++) {
//                 for (int k = j + 1; k < n; k++) {

//                     if (nums[i] + nums[j] + nums[k] == 0) {
//                         if (result.isEmpty() ||
//                             !result.get(result.size() - 1).equals(
//                                 Arrays.asList(nums[i], nums[j], nums[k]))) {

//                             result.add(Arrays.asList(nums[i], nums[j], nums[k]));
//                         }
//                     }
//                 }
//             }
//         }

//         return result;
//     }
// }






















// // class Solution {
// //     public List<List<Integer>> threeSum(int[] nums) {
// //         int n = nums.length;
// //         Arrays.sort(nums);
// //         List<List<Integer>> result = new ArrayList<>();
// //         for(int i=0;i<n;i++){
// //             for(int j=i+1;j<n;j++){
// //                  for(int k=j+1;k<n;k++){
// //                     if(nums[i]+nums[j]+nums[k]==0){
// //                         List<Integer> triplet = new ArrayList<>();
// //                          triplet.add(nums[i]);
// //                          triplet.add(nums[j]);
// //                          triplet.add(nums[k]);

// //                          result.add(triplet);
// //                     }
// //                  }
// //             }
// //         }
// //         return result;
// //     }
// // }