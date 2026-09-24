class MyStack {
    ArrayList<Integer> list;

    public MyStack() {
        this.list = new ArrayList<>();
    }
    
    public void push(int x) {
        this.list.add(x);
    }
    
    public int pop() {
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i <= this.list.size() - 1; i++) {
            newList.add(this.list.get(0));
            this.list.remove(0);
        }

        int lastInt = this.list.get(0);
        this.list = newList;
        return lastInt;
    }
    
    public int top() {
        return this.list.get(list.size() - 1);
    }
    
    public boolean empty() {
        return this.list.isEmpty();
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