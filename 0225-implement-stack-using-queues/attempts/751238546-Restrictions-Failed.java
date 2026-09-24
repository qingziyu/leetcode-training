class MyStack {
    ArrayDeque<Integer> listA;
    ArrayDeque<Integer> listB;

    public MyStack() {
        this.listA = new ArrayDeque<>();
        this.listB = new ArrayDeque<>();
    }
    
    public void push(int x) {
        this.listA.add(x);
    }
    
    public int pop() {
        while(this.listA.size() > 1) {
            listB.add(this.listA.peek());
            this.listA.remove(0);
        }

        int lastInt = this.listA.peek();
        this.listA.remove(0);
        ArrayDeque<Integer> tmp = listA;
        this.listA = listB;
        this.listB = tmp;
        return lastInt;
    }
    
    public int top() {
        while(this.listA.size() > 1) {
            listB.add(this.listA.peek());
            this.listA.remove(0);
        }

        int lastInt = this.listA.peek();
        this.listA.remove(0);
        this.listB.add(lastInt);

        ArrayDeque<Integer> tmp = listA;
        this.listA = listB;
        this.listB = tmp;
        return lastInt;
    }
    
    public boolean empty() {
        return this.listA.isEmpty();
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