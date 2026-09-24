class MinStack {
    Node node;

    private class Node {
        int currentIInt;
        Node previousNode;
        int minNum;

        Node(int value, Node previousNode, int minNum) {
            this.currentIInt = value;
            this.previousNode = previousNode;
            this.minNum = minNum;
        }
    }

    public MinStack() {
        Node node = null;
        this.node = node;
    }
    
    public void push(int value) {
        Node node;

        if (this.node == null) {
            node = new Node(value, null, value);
        } else if (value < this.node.minNum) {
            node = new Node(value, this.node, value);
        } else {
            node = new Node(value, this.node, this.node.minNum);
        }

        this.node = node;
    }
    
    public void pop() {
        this.node = this.node.previousNode;
    }
    
    public int top() {
        return this.node.currentIInt;
    }
    
    public int getMin() {
        return this.node.minNum;
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