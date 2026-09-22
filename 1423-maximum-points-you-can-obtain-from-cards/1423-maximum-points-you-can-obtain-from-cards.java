class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int m=n-k; //no of mid elements
        int sum=0; //mid element sum
        for(int i=0;i<m;i++){
            sum+=cardPoints[i];
        }
        int minsum=sum;
        for(int i=m;i<n;i++){
            sum=sum-cardPoints[i-m]+cardPoints[i];
            minsum=Math.min(minsum,sum);
        }
        int totalsum=0;
        for(int i=0;i<n;i++){
        totalsum+=cardPoints[i];
        }

        return totalsum-minsum;
    }
}