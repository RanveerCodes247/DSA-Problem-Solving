class Solution {
    public int maxPoints(int[][] points) {

        int n = points.length;

        if(n <= 2) return n;

        int ans = 0;

        for(int i = 0; i < n; i++) {

            HashMap<String, Integer> freq = new HashMap<>();

            int localMax = 0;

            for(int j = 0; j < n; j++) {

                if(i == j) continue;

                int dx = points[j][0] - points[i][0];
                int dy = points[j][1] - points[i][1];

                if(dx == 0) {
                    dy = 1;
                    dx = 0;
                } 
                else {
                    int g = gcd(Math.abs(dy), Math.abs(dx));

                    dy = dy / g;
                    dx = dx / g;

                    if(dx < 0) {
                        dy = -dy;
                        dx = -dx;
                    }
                }
                String key = dy + "," + dx;
                freq.put(key, freq.getOrDefault(key, 0) + 1);

                localMax = Math.max(localMax, freq.get(key));
            }

            ans = Math.max(ans, localMax + 1);
        }

        return ans;
    }

    public int gcd(int a, int b) {
        while(b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }

        return a;
    }
}