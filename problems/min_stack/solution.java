class MinStack {

    Stack<Integer> original = new Stack<Integer>();
    Stack<Integer> min = new Stack<Integer>();
    
    public void push(int x) {
        if(min.isEmpty() || min.peek() > x)
        {
            min.push(x);
        }
        else
        {
            min.push(min.peek());
        }
        original.push(x);
        
    }
    
    public void pop() {
        if(!min.isEmpty())
        {
            min.pop();
        }
        if(!original.isEmpty())
        {
            original.pop();
        }
        
    }

    
    public int top() {
        return original.peek();
        
    }
    
    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */