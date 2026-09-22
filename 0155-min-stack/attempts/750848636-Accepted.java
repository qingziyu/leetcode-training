class MinStack {

    private static class Node {
        int currentInt;
        int minSeenInt;
        Node previousNode;

        Node(int currentInt, int minSeenInt, Node previousNode){
            this.currentInt = currentInt;
            this.minSeenInt = minSeenInt;
            this.previousNode = previousNode;
        }
    }

    private Node node;

    public MinStack() {
        this.node = null;
    }
    
    public void push(int value) {
        int currentMin;
        if (this.node != null) {

            currentMin = this.node.minSeenInt;

            if (currentMin > value) {
                currentMin = value;
            }

        } else {
            currentMin = value;
        }
        
        Node newNode = new Node(value, currentMin, this.node);
        this.node = newNode;
    }
    
    public void pop() {
        this.node = this.node.previousNode;
    }
    
    public int top() {
        return this.node.currentInt;
    }
    
    public int getMin() {
        return this.node.minSeenInt;
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