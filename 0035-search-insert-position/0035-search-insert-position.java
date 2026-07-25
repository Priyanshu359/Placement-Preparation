class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        int n = nums.length-1;
        int mid = 0;

        while(i<=n) {
            mid = (i+n)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target ){
                i = mid+1;
            }
            else {
                n = mid-1;
            }
        }

        return i;
    }
}