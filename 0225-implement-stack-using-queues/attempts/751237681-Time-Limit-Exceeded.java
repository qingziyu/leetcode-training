class MyStack {
    ArrayList<Integer> listA;
    ArrayList<Integer> listB;

    public MyStack() {
        this.listA = new ArrayList<>();
        this.listB = new ArrayList<>();
    }
    
    public void push(int x) {
        this.listA.add(x);
    }
    
    public int pop() {
        while(this.listA.size() > 1) {
            listB.add(this.listA.get(0));
            this.listA.remove(0);
        }

        int lastInt = this.listA.get(0);
        this.listA.remove(0);
        ArrayList<Integer> tmp = listB;
        this.listA = listB;
        this.listB = tmp;
        return lastInt;
    }
    
    public int top() {
        while(this.listA.size() > 1) {
            listB.add(this.listA.get(0));
            this.listA.remove(0);
        }

        int lastInt = this.listA.get(0);
        this.listA.remove(0);
        this.listB.add(lastInt);

        ArrayList<Integer> tmp = listB;
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