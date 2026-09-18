class Solution {

    public int maxEnvelopes(int[][] envelopes) {

        int n = envelopes.length;

        Arrays.sort(envelopes, (a, b) -> {
            if (a[0] == b[0]) {
                return b[1] - a[1];
            }
            return a[0] - b[0];
        });

        int[] lis = new int[n];
        int size = 0;

        for (int i = 0; i < n; i++) {

            int height = envelopes[i][1];

            int left = 0;
            int right = size;

            while (left < right) {

                int mid = left + (right - left) / 2;

                if (lis[mid] >= height) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }

            lis[left] = height;

            if (left == size) {
                size++;
            }
        }

        return size;
    }
}

// Bubble sort + O(n^2) approach resulted in TLE
// class Solution {
//     public int maxEnvelopes(int[][] envelopes) {
//         int n = envelopes.length;
//         for(int i=0;i<n-1;i++){
//             for(int j=0;j<n-i-1;j++){
//          if(envelopes[j][0]>envelopes[j+1][0] || envelopes[j][0] == envelopes[j+1][0] && envelopes[j][1]<envelopes[j+1][1]){
//             int temp[] = envelopes[j];
//             envelopes[j]=envelopes[j+1];
//             envelopes[j+1]=temp;
//          }
//             }
//         }
//         int dp[] = new int[n];
//         for (int i = 0; i < n; i++) {
//         dp[i] = 1;
//         }
//         for(int i=0;i<n;i++){
//             for(int j=0;j<i;j++){
//                 if(envelopes[j][1]<envelopes[i][1]){
//                 dp[i] = Math.max(dp[i], dp[j] + 1);
//                 }
//             }
//         }
//         int ans=0;
//         for(int i=0;i<n;i++){
//             ans=Math.max(ans,dp[i]);
//         }
//         return ans;
//     }
// }