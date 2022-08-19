class MyQueue {
    Stack<Integer> s1= new Stack<>();
    Stack<Integer> s2= new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        s1.push(x);
    }
    
    public int pop() {
        while(!s1.isEmpty())
            s2.push(s1.pop());
        int a= s2.pop();
        while(!s2.isEmpty())
            s1.push(s2.pop());
        return a;
    }
    
    public int peek() {
        while(!s1.isEmpty())
            s2.push(s1.pop());
        int a= s2.peek();
        while(!s2.isEmpty())
            s1.push(s2.pop());
        return a;
    }
    
    public boolean empty() {
        if(s1.isEmpty())
            return true;
    else
        return false;
    }
}


/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
