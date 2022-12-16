class MyQueue {
public:
    stack<int>t;
    stack<int>q;
    MyQueue() {}
    
    void push(int x) {
        t.push(x);
    }
    
    void exchange(){
        while(!t.empty()){
            q.push(t.top());
            t.pop();
        }
    }
    
    int pop() {
        int i;
        if(q.empty()) exchange();
        i=q.top();
        q.pop();
        return i;
    }
    
    int peek() {
        if(q.empty()) exchange();
        return q.top();
    }
    
    bool empty() {
        return q.empty()&&t.empty();
    }
};

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue* obj = new MyQueue();
 * obj->push(x);
 * int param_2 = obj->pop();
 * int param_3 = obj->peek();
 * bool param_4 = obj->empty();
 */
