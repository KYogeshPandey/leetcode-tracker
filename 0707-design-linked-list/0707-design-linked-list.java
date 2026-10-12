class MyLinkedList {
    Node head;
    int size;

    public MyLinkedList() {
        head = new Node(0);
        size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }

        Node curr = head.next;

        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }

        return curr.data;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {
        if (index < 0) {
            index = 0;
        }

        if (index > size) {
            return;
        }

        Node curr = head;

        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }

        Node temp = new Node(val);
        temp.next = curr.next;
        curr.next = temp;

        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }

        Node curr = head;

        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }

        curr.next = curr.next.next;

        size--;
    }
}

class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
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