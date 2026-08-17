class MinStack {
Stack<Integer> minStack;
Stack<Integer> stk;
    public MinStack() {
        stk=new Stack<>();
        minStack=new Stack<>();
    }
    
    public void push(int val) {
        stk.push(val);
        if(minStack.empty()||val<=minStack.peek())
          minStack.push(val);
    }
    
    public void pop() {
        if(stk.peek().equals(minStack.peek()))
           minStack.pop();
        stk.pop();  
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */