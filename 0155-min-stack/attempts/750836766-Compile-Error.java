class MinStack {
    int currentInt;
    MinStack previousStack;
    int minSeenInt;

    public MinStack(int currentInt, MinStack previousStack) {
        this.currentInt = currentInt;
        this.previousStack = previousStack

        if (currentInt < minSeenInt) {
            minSeenInt = currentInt
        }
    }
    
    public void push(int value) {
        MinStack newMinStack = new MinStack(value, this);
    }
    
    public void pop() {
        return this.previousStack;
    }
    
    public int top() {
        return currentInt;
    }
    
    public int getMin() {
        return minSeenInt;
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