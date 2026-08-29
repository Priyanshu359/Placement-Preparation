class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int answer[] = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        for(int i= 2* nums.length -1; i>=0; i--) {
            int index = i % nums.length;
            while(!stack.isEmpty() && stack.peek() <= nums[index]){
                stack.pop();
            }
            
            if(stack.isEmpty()){
                answer[index] = -1;
            }
            else{
                answer[index] = stack.peek();
            }
            stack.push(nums[index]);
        }
        return answer;
    }
}