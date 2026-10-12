class MyCircularQueue {
    int[] data;
    int head;
    int tail;
    int size;

    public MyCircularQueue(int k) {
        this.data = new int[k];
        this.head = 0; // 队首的pointer
        this.tail = 0; // 队尾的pointer，下一次插入该写入的地方
        this.size = 0; // 已经插入数据的数量
    }
    
    public boolean enQueue(int value) {
        if (size == this.data.length) {
            return false;
        }

        this.data[tail] = value;
        this.tail = (this.tail + 1) % data.length;
        this.size++;

        return true;
    }
    
    public boolean deQueue() {
        if (size == 0) {
            return false;
        }

        this.head = (this.head + 1) % data.length;
        this.size--;
        return true;
    }
    
    public int Front() {
        if (size == 0) {
            return -1;
        }

        return this.data[head];
    }
    
    public int Rear() {
        if (size == 0) {
            return -1;
        }

        return this.data[(tail - 1 + data.length) % data.length];
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == data.length;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */