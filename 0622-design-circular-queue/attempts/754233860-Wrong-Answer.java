class MyCircularQueue {
    int[] data;
    int head;
    int tail;
    int size;

    public MyCircularQueue(int k) {
        this.data = new int[k];
        this.head = 0;
        this.tail = 0;
        this.size = 0;
    }
    
    public boolean enQueue(int value) {
        if (size == this.data.length) {
            return false;
        }

        if (size == 0) {
            this.data[0] = value;
            this.tail = 1;
            this.size++;
            return true;
        }

        this.data[tail] = value;
        this.tail = (this.tail + 1)%data.length;
        this.size++;

        return true;
    }
    
    public boolean deQueue() {
        if (size == 0) {
            return false;
        }

        this.head = (this.head + 1)%data.length;
        this.size--;
        return true;
    }
    
    public int Front() {
        if (size == 0) {
            return -1;
        }

        return this.data[(head - 1 + data.length)%data.length];
    }
    
    public int Rear() {
        if (size == 0) {
            return -1;
        }

        return this.data[(tail - 1 + data.length)%data.length];
    }
    
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }

        return false;
    }
    
    public boolean isFull() {
        if (size == this.data.length) {
            return true;
        }

        return false;
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