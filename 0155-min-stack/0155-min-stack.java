class MinStack {

    Stack min=new Stack<>();
    PriorityQueue<Integer> pq=new PriorityQueue<>();
    public MinStack() {
    }
    
    public void push(int val) {
        min.push(val);
        pq.offer(val);
    }
    
    public void pop() {
        pq.remove(min.pop());
    }
    
    public int top() {
        return (int)min.peek();
    }
    
    public int getMin() {
        return (int)pq.peek();
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