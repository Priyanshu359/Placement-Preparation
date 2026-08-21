class Solution {
    public List<Integer> majorityElement(int[] nums) {
int candidate1 = 0, candidate2 = 1; // init to two different values
        int count1 = 0, count2 = 0;

        for (int num : nums) {
            if (num == candidate1) {
                count1++;                       // vote for candidate1
            } else if (num == candidate2) {
                count2++;                       // vote for candidate2
            } else if (count1 == 0) {
                candidate1 = num;               // slot 1 is free → adopt
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;               // slot 2 is free → adopt
                count2 = 1;
            } else {
                count1--;                       // num opposes both → cancel one of each
                count2--;
            }
        }

        // Step 2: verify — candidates are only POSSIBLE answers, not guaranteed
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == candidate1) count1++;
            else if (num == candidate2) count2++;
        }

        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        if (count1 > n / 3) result.add(candidate1);
        if (count2 > n / 3) result.add(candidate2);
        return result;
    }
}