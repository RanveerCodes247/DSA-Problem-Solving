class Solution {
    public int arrangeCoins(int k) {
        return (int)((-1 + Math.sqrt(1 + 8.0 * k)) / 2);
    }
}