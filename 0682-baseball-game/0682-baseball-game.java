class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int totalScore = 0;
        for(int i=0; i<operations.length; i++) {
            if(operations[i].equals("C") && !stack.isEmpty()) {
                stack.pop();
            }
            else if (operations[i].equals("D") && !stack.isEmpty()) {
                int latestScore = stack.peek();
                stack.push(latestScore*2);
            }
            else if (operations[i].equals("+") && stack.size()>=2) {
                int num1 = stack.pop();
                int num2 = stack.peek();
                stack.push(num1);
                stack.push(num1+num2);
            }
            else{
                stack.push(Integer.parseInt(operations[i]));
            }
        }

        while(!stack.isEmpty()){
            totalScore += stack.pop();
        }
        return totalScore;
    }
}