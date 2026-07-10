class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int sameNum = nums[0];
        for(int i=1; i<nums.length; i++){
            if(count==0) {
                sameNum = nums[i];
            }
            if(nums[i]==sameNum){
                count++;
            }
            else{
                count--;
            }
        }
        return sameNum;
    }
}