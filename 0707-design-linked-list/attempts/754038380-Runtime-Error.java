class MyLinkedList {
    ListNode head;
    ListNode tail;
    int size = 0;

    private class ListNode {
        int val;
        ListNode next;

        public ListNode(int val, ListNode nextNode) {
            this.val = val;
            this.next = nextNode;
        }

        public ListNode() {
        }
    }

    public MyLinkedList() {
        
    }
    
    public int get(int index) {
        if (index > size - 1) {
            return -1;
        } 

        ListNode pointer = head;

        for (int i = 0; i < index; i++) {
            pointer = pointer.next;
        }

        return pointer.val;
    }
    
    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val, head);
        if (head == null) {
            this.tail = newNode;
            this.head = newNode;
            this.size = this.size + 1;
            return;
        }

        this.head = newNode;
        this.size = this.size + 1;
    }
    
    public void addAtTail(int val) {
        ListNode newNode = new ListNode(val, null);
        if (tail == null) {
            this.tail = newNode;
            this.head = newNode;
            this.size = this.size + 1;
            return;
        }

        this.tail.next = newNode;
        this.tail = newNode;
        this.size = this.size + 1;
    }
    
    public void addAtIndex(int index, int val) {
        ListNode newNode = new ListNode(val, null);
        ListNode pointer = head;

        if (head == null && index == 0) {
            this.head = newNode;
            this.tail = newNode;
            this.size = this.size + 1;
            return;
        }

        for (int i = 0; i < index - 1; i++) {
            pointer = pointer.next;
        }

        ListNode nextNode = pointer.next;
        pointer.next = newNode;
        newNode.next = nextNode;
        this.size = this.size + 1;

        if (index == 0) {
            this.head = newNode;
        }

        if (index + 1 == this.size) {
            this.tail = newNode;
        }
    }
    
    public void deleteAtIndex(int index) {
        ListNode pointer = head;

        if (index < 0 || index >= size) {
            return;
        }

        if (this.size == 1) {
            this.head = null;
            this.tail = null;
            this.size = 0;
            return;
        }

        if (index == 0) {
            this.head = this.head.next;
        } else {
            
            for (int i = 0; i < index - 1; i++) {
                pointer = pointer.next;
            }

            if (pointer.next == tail) {
                pointer.next = null;
                tail = pointer;
            } else {
                pointer.next = pointer.next.next;
            }
        }

        this.size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */