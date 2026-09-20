class Solution {
    public int arrangeCoins(int n) {
        int balance = n;
int count = 0;

for (int i = 1; i <= n; i++) {
    if (balance >= i) {
        balance -= i;
        count++;
    } else {
        break;
    }
}

return count;
    }
}