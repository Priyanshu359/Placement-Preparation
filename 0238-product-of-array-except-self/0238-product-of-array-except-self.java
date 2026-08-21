class Solution {
    public int[] productExceptSelf(int[] nums) {
int n = nums.length;
        int[] answer = new int[n];

        // Pass 1: answer[i] holds product of everything to the LEFT of i
        answer[0] = 1;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        // Pass 2: multiply in the running product from the RIGHT
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * rightProduct;   // left × right
            rightProduct = rightProduct * nums[i];  // update for next step left
        }
        return answer;
    }
}