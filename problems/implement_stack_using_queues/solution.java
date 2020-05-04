class MyStack {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>(); 
    
    /** Initialize your data structure here. */
    public MyStack() {
        
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        if(q1.isEmpty())
        {
            q1.add(x);
            while(!q2.isEmpty())
            {
                q1.add(q2.remove());
                
            }
        }
        else
        {
            q2.add(x);
            while(!q1.isEmpty())
            {
                q2.add(q1.remove());
            }
        }
        
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(!q1.isEmpty())
        {
            return q1.remove();
        }
        else
        {
            return q2.remove();
        }
        
    }
    
    /** Get the top element. */
    public int top() {
        
        if(!q1.isEmpty())
        {
            return q1.peek();
        }
        else
        {
            return q2.peek();
        }
        
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        if(q1.isEmpty() && q2.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */