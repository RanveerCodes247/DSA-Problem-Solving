class Solution {
    public int[] countBits(int n) {
        int result[] = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            int num = i;
            int count = 0;

            while (num > 0) {
                if (num % 2 == 1) {
                    count++;
                }
                num = num / 2;
            }

            result[i] = count;
        }

        return result;
    }
}








// class Solution {
//     public int[] countBits(int n) {
//        int result[] = new int[n+1];
//        for(int i=0;i<=n;i++){
//          String bin = Integer.toBinaryString(i);
//          int count=0;
//           for(int j=0;j<bin.length();j++){
//             if(bin.charAt(j)=='1'){
//                 count++;
//             }
//             result[i]=count;
//           }
//        } 
//        return result;
//     }
// }