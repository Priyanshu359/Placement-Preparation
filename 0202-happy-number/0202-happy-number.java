class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = squareSum(slow);
            fast = squareSum(squareSum(fast));
        }
        while ( slow != fast);

        return slow==1;
    }
    private static int squareSum(int n) {
        int sum = 0;
        while(n>0) {
            int digits = n%10;
            sum += digits * digits;
            n = n/10;
        }
        return sum;
    }
}