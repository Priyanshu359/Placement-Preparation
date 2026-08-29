class Node {
    int value;
    int min;
    Node(int value, int min){
        this.value = value;
        this.min = min;
    }
}
class MinStack {
    Stack<Node> stack = new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int value) {
        if(stack.isEmpty()){
            stack.push(new Node(value, value));
        } else{
            stack.push(new Node(value, Math.min(value, stack.peek().min)));
        }
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek().value;
    }
    
    public int getMin() {
        return stack.peek().min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */