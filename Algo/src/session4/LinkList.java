package session4;

public class LinkList {
    private class Node {
        int value;
        Node next;
        public Node(int value, Node next) { this.value = value;this.next = next; }
        public int getValue() {
            return value;
        }

        public void setNext(Node next) { this.next = next;}
        @Override public String toString() {return String.valueOf(value);}
    }

    Node head = null;
    int length = 0;

    public int get(int index) {
        int indexCounter = 0;
        Node next = head;
        while(index != indexCounter) {
            next = next.next;
            indexCounter++;
        }
        return next.getValue();
    }

    public void addHead(int el) {
        final Node newNode = new Node(el, null);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addTail(int el) {
        final Node newNode = new Node(el, null);
        if (head == null) {
            head = newNode;
        } else {
            // TODO addTail to tail
            Node nextEl = head;
            while (nextEl.next != null) {
                nextEl = nextEl.next;
            }
            nextEl.next = newNode;
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node nextEl = head;
        while (nextEl != null) {
            stringBuilder.append(nextEl.value);
            stringBuilder.append("->");
            nextEl = nextEl.next;
        }
        return stringBuilder.toString();
    }
}