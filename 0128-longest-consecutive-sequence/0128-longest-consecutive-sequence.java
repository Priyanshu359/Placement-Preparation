class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        int longest = 0;
        for(int num : set){
            if(!set.contains(num-1)){
                int length = 1;
                int current = num;

                while(set.contains(current + 1)){
                    current = current+1; 
                    length = length + 1;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}